package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Board2Filter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Board2Filter 요청 전 필터");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Board2Filter 응답 후 필터");
    }
}
