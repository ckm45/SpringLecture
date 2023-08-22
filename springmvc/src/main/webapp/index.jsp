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
<a href="${pageContext.request.contextPath}/member/joinForm">회원가입</a>
<a href="${pageContext.request.contextPath}/stringresponse">스트링ResponseBody</a>
<a href="${pageContext.request.contextPath}/voresponse">객체ResponseBody</a>
<a href="${pageContext.request.contextPath}/volistresponse">객체리스트ResponseBody</a>
<a href="${pageContext.request.contextPath}/hello/3">pathVariable</a><br>
<a href="${pageContext.request.contextPath}/file/uploadform">FileUpload</a>

<br>
=========================<br>

request.servletPath : ${pageContext.request.servletPath}<br>
request.contextPath : ${pageContext.request.contextPath}<br>





</body>
</html>