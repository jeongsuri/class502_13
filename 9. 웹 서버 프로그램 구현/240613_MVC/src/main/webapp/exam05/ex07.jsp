<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:forTokens var="item" items="Apple#Orage#Melon" delims="#+">
    <div>${item}</div>
</c:forTokens>
