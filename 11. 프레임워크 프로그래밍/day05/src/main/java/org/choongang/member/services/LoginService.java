package org.choongang.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberMapper mapper;
    private final HttpSession session;
    private final HttpServletResponse response;

    public void process(String email) {
        /**
         * 1.email로 회원조회
         * 2. 세션에 회원 정보 유지
         */
        Member member = mapper.get(email);
        if(email==null){
            return;
        }
        session.setAttribute("member", member);
    }

    public void process(RequestLogin form) {
        process(form.getEmail()); //로그인처리

        /* 이메일 기억하기 처리 */
        Cookie cookie = new Cookie("savedEmail", form.getEmail());
        if(form.isSaveEmail()){ //쿠키등록
            cookie.setMaxAge(60 * 60 * 24 * 7); //7일간 쿠키유지
        }else{
            cookie.setMaxAge(0); //쿠키제거
        }

        response.addCookie(cookie); //해당 쿠키가 삭제 or 등록
    }
}
