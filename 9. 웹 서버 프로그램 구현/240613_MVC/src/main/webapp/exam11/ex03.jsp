<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key2", "value2");
    cookie.setMaxAge(60 * 60 * 24 * 7); //7일 설정
    response.addCookie(cookie);
%>