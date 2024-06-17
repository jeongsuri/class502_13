<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:set var="html" value="<script>alert('알림!');</script>"/>
<%--${html}--%>
<c:out value="${html}" />
<c:out value="${html}" default="값 없음"/><br>
<c:out value="<h1>제목</h1>" />
<c:out value="<h1>제목</h1>" escapeXml="false"/>