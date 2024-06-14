<%@ page contentType="text/html; charset=UTF-8" %>
<%
    application.setAttribute("num",100);
    request.setAttribute("num",200);
    pageContext.setAttribute("num",300);
    pageContext.setAttribute("max-num",1000);
%>

pageContext.num : ${pageScope.num}<br>
request.num : ${requestScope.num}<br>
application.num : ${applicationScope.num}<br>
pageContext.num : ${pageScope['num']}<br>
request.num : ${requestScope['num']}<br>
application.num : ${applicationScope['num']}<br>
max-num : ${pageScope['max-num']}<br>
<%--변수명때문에 .을 사용하게되면 인식하지못하기 때문에 []사용해야한다.--%>
<%--max-num : ${pageScope.max-num}<br>--%>
