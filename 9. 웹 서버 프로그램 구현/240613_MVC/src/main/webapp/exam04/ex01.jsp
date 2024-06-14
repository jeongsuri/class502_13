<%@ page contentType="text/html; charset=utf-8" %>
<%
    pageContext.setAttribute("num",10);
%>
${100+200}<br>
${num == 10 ? "숫자 10":"숫자10이 아닙니다"}