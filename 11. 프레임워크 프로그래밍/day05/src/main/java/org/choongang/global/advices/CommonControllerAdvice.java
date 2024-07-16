package org.choongang.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, HttpServletRequest request, HttpServletResponse response, Model model){
        e.printStackTrace();
        log.info("advice에서 유입");
        // 기본 HTTP 상태 코드를 INTERNAL_SERVER_ERROR(500)으로 설정
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; //500

        // 예외가 CommonException 타입인 경우 해당 예외의 상태 코드를 사용
        if(e instanceof CommonException commonException){
            //CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }
        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.setViewName("error/common");
        return mv;
    }
}
