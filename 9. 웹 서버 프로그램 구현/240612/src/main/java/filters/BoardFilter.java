package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/member")
public class BoardFilter implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("BoardFilter 요청 전 필터");
        chain.doFilter(request, response); //다음 필터 또는 서블릿의 처리 메서드 실행
        System.out.println("BoardFilter 응답 후 필터");
    }
}
