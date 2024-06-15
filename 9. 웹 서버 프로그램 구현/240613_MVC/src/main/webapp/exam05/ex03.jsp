<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:set var="num" value="10"/>
<c:if test="${num % 2 == 1}">
    홀수입니당!
</c:if>
<c:if test="${!(num % 2 == 1)}">
    짝수입니당.
</c:if>
<br>
${num % 2 == 1 ? '홀수':'짝수'}