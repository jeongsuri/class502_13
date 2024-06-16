package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class BoardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("BoardFilter 요청 전 필터");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("BoardFilter 응답 후 필터");
    }
}
