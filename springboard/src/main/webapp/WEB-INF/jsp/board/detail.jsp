<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script>
$(document).ready(function(){
	$('#replyAddBtn').click(function(){
		alert('클릭 성공')
		//reply insert를 여기서 할 것
		
		let replyContent = document.replyForm.content.value;
		let replyWriter = document.replyForm.writer.value;
		
		$.ajax({
			url :  '${pageContext.request.contextPath}/reply'     ,
			method :   'post',
			data:  {
				boardNo : ${boardVO.no},
				content: replyContent,
				writer:  replyWriter
				
			},
			success:     function(){
				alert('insert성공');
				document.replyForm.content.value="";
				document.replyForm.writer.value="";
			},
			error:       function(){
				alert('insert실패')
			}
		})
	})
})

</script>
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
		<input type="button" value="Home" onclick="location.href='${pageContext.request.contextPath}/'">
		<input type="button" value="목록으로" onclick="location.href='${pageContext.request.contextPath}/board'">
		<input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/'">
	</div>
	
	<div>
	   <form name="replyForm">
	       댓글: <input type= "text" size="80" name="content">
	       작성자: <input type = "text" size ="20" name ="writer">
	       <input type="button" value="댓글쓰기" id="replyAddBtn">
	   </form>	   
	</div>
	
</body>
</html>