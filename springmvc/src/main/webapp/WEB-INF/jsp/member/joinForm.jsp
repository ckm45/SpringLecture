<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 페이지입니다. 
    <form action="${pageContext.request.contextPath}/member/join" method="post">
        id: <input type= "text" name= "id"><br>
        password: <input type= "text" name= "password"><br>
        <input type= "submit" value = "회원가입">
        
    </form>
</body>
</html>