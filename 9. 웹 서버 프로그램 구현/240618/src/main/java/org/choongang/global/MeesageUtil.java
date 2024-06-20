package org.choongang.global;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MeesageUtil {
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        if(e instanceof CommonException commonException ) { //밑에랑 같음.
            //CommonException commonException = (CommonException) e;
            resp.setStatus(commonException.getStatus());
        }
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage()); //history.back() 뒤로가기
    }

    public static void go(String url,String target, HttpServletResponse resp) throws IOException { //매개변수3개
        target = target == null || target.isEmpty() ? "self" : target;
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //location.href는 주소이동시 기록이 남기 때문에 뒤로 이동할 시 POST 처리가 중복
        //location.replace를 사용하면 기록을 남기지 않고 주소 이동이 가능
        out.printf("<script>%s.location.replace='%s';</script>", target, url);
    }

    public static void go(String url, HttpServletResponse resp) throws IOException { //매개변수2개 2개일떄는(self)
        go(url, "self", resp);
    }
}
