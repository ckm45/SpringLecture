<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
인덱스
<a href="<%= request.getContextPath()%>/hello/h1">HelloController</a><br>
<!-- EL 표기법 -->
<a href="${pageContext.request.contextPath}/hello/h1">HelloController</a><br>
<a href="${pageContext.request.contextPath}/method/method">method/method</a>

<br>
=========================<br>

request.servletPath : ${pageContext.request.servletPath}<br>
request.contextPath : ${pageContext.request.contextPath}<br>


</body>
</html>