package org.choongang.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class MemberOnlyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("유입");

        HttpSession session = request.getSession();
        if(session.getAttribute("member") != null) {//로그인 상태인경우
            return true; //컨트롤러 빈 메서드 실행
        }
        response.sendRedirect(request.getContextPath() + "/member/login"); ////로그인 상태가 아닐경우 : 로그인페이지로 페이지 이동
        return false; //로그인 상태가 아닐경우 : 컨트롤러 빈 메서드 실행 X
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("message", "postHandle!"); //속성을 추가, 뷰페이지에서 접근이 가능.
        log.info("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion");
    }
}
