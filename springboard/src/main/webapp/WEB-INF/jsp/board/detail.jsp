<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/"><img alt="" src="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"></a>
<a href="${pageContext.request.contextPath}/board">게시판</a>
<a href="${pageContext.request.contextPath}/board/new">글쓰기</a>
    <c:if test="${empty currentUser }">
        <a href="${pageContext.request.contextPath}/login">로그인</a>
    </c:if>
    <c:if test="${not empty currentUser }">
        ${currentUser.name }님 안녕하세요.<br>
        <a href="${pageContext.request.contextPath}/logout">로그아웃</a>
    </c:if>
<a href="${pageContext.request.contextPath}/join">회원가입</a>

	상세게시글입니다.

	<div align="center">
		<table border="1" width="60%">
			<tr>
				<th>번호</th>
				<td>${boardVO.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${boardVO.title }</td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td>${boardVO.writer}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${boardVO.regDate }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${boardVO.content}</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${boardVO.count }</td>
			</tr>
		</table>
	</div>
</body>
</html>