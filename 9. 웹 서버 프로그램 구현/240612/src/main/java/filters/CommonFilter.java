package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class CommonFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()");
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.println(key1 + ":" + key2);
    }

    @Override
    public void destroy() {
        System.out.println("destory()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //System.out.println("CommonFilter - 요청 전");
        filterChain.doFilter(new CommonRequestWrapper(servletRequest),servletResponse);
        //System.out.println("CommonFilter - 응답 후");

    }
}
