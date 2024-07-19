package org.choongang.global;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Utils {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    public Map<String, List<String>> getErrorMessages(Errors errors) {


        // FieldErrors
        Map<String, List<String>> messages = errors.getFieldErrors()
                .stream()
                .collect(Collectors.toMap(FieldError::getField, e -> getCodeMessages(e.getCodes())));
        //"필드명","필드에러메세지"


        // GlobalErrors
        List<String> gMessages = errors.getGlobalErrors()
                .stream()
                .flatMap(e -> getCodeMessages(e.getCodes()).stream()).toList();

        if (!gMessages.isEmpty()) {
            messages.put("global", gMessages);
        }
        return messages;
    }


    public List<String> getCodeMessages(String[] codes) {
        ResourceBundleMessageSource ms = (ResourceBundleMessageSource) messageSource;
        ms.setUseCodeAsDefaultMessage(false); // MessageConfig에서 설정한, (메세지 코드가 없는 경우 코드로 메세지 대체)를 기능을 끔.

        List<String> messages = Arrays.stream(codes)
                .map(c -> {
                    try {
                        // 코드에 해당하는 메시지를 가져옴
                        return ms.getMessage(c, null, request.getLocale());
                    } catch (Exception e) {
                        return "";
                    }
                })
                .filter(s -> s != null && !s.isBlank())
                .toList();

        ms.setUseCodeAsDefaultMessage(true); //MessageConfig는 Bean객체로 싱글톤으로 관리되는 객체이기떄문에 값을 다시 변경해줌.
        return messages;
    }
}