package org.choongang.member.validators;


import lombok.RequiredArgsConstructor;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validaotrs.RequiredValidator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) { //RequestJoin 커맨드 객체만 검증하도록 제한
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // 1. 필수 항목 검증(email, password, confirmPassword, userName, agree)
        //2. 이메일 중복 여부 검증(회원이 가입되어 있는지 체크)
        //3. 비밀번호 자리수 체크 ( 8자리 이상 )
        //4. 비밀번호 + 비밀번호확인 일치 여부

        RequestJoin form = (RequestJoin) target;
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userNAme = form.getUserName();
        boolean agree = form.isAgree();

        // 필수 항목 검증
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","Required", "이메일을 입력하세요");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","Required", "비밀번호를 입력하세요");
    }
}