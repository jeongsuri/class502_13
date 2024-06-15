package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter(); //문자열 스트링
        out.println("<h1>회원가입</h1>");
        out.println("<form method='POST' action='join'>");
        out.println("이메일 : <input type ='text' name='email'><br>");
        out.println("비밀번호 : <input type='password' name='password'><br>");
        out.println("비밀번호 확인 : <input type='password' name='confirmPassword'><br>");
        out.println("회원명 : <input type='text' name='username'><br>");
        out.println("취미 : <input type='checkbox' name='hobby' value='취미1'>취미1");
        out.println("<input type='checkbox' name='hobby' value='취미2'>취미2");
        out.println("<input type='checkbox' name='hobby' value='취미3'>취미3");
        out.println("<input type='checkbox' name='hobby' value='취미4'>취미4");
        out.println("<input type='checkbox' name='hobby' value='취미5'>취미5<br>");
        out.println("<button type='submit'>가입하기</buttnon>");
        out.println("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");// 서블릿 4버전 까지 필요, 기본 유니코드 2바이트 형식, 서블릿 6버전 부터는 기본 유닛코드가 3바이트(UTF8)

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String username = req.getParameter("username");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(email);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(username);
        Arrays.stream(hobbies).forEach(System.out::println);
    }
}
