<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:choose>
    <c:when test="${param.age < 8}">
        응애
    </c:when>
    <c:when test="${param.age < 14}">
        초딩
    </c:when>
    <c:when test="${param.age < 17}">
        중딩
    </c:when>
    <c:when test="${param.age < 20}">
        고딩
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>