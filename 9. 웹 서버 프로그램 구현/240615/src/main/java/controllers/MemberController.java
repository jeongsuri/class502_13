package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/member/*") //web.xml에 서블릿파일을 등록안해도됨.
public class MemberController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if(mode.equals("join")){
            joinForm(req,resp);
        } else if (mode.equals("login")) {
            loginForm(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if(mode.equals("join")){
            joinProcess(req,resp);
        }else if (mode.equals("login")) {
            loginProcess(req,resp);
        }
    }

    private String getMode(HttpServletRequest request) {
        String url = request.getRequestURI();
        String[] urls = url.split("/");
        String mode = urls.length > 0 ? urls[urls.length - 1] : "";
        return mode;
    }

    //회원가입양식
    private void joinForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>");
    }

    //로그인양식
    private void loginForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>로그인</h1>");
    }

    //회원가입처리
    private void joinProcess(HttpServletRequest req, HttpServletResponse resp){

    }

    //로그인처리
    private void loginProcess(HttpServletRequest req, HttpServletResponse resp){

    }
}
