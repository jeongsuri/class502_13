package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        //모든 서블릿이 공유 가능한 초기 설정 값 - context-param
        String common1 = req.getServletContext().getInitParameter("common1");
        String common2 = req.getServletContext().getInitParameter("common2");
        System.out.println(common1 + " " + common2);
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }

    /*
    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }
     */

    @Override
    public void init(ServletConfig config) throws ServletException {
        // HelloServlet에서만 조회 가능
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.println(key1 + " " + key2);

    }
}
