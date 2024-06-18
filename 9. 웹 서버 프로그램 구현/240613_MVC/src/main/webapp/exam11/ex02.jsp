<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie[] cookies = request.getCookies();
    for(Cookie cookie : cookies){
        String name = cookie.getName();
        String value = cookie.getValue();

        System.out.println(name);
        System.out.println(value);
    }
%>