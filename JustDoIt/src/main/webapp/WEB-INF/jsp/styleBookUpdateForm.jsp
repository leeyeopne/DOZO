<%@page import="co.yedam.vo.StyleBookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>

 .container input {
 	width: 500px;
 }
 
</style>

<div class="container">
	 <div class="contact__form">
       <h5 style="margin-top: 30px;">게시물 수정</h5>
       <form action="updateStyleBook.do?bno=${board.boardNo}" method="post" enctype="multipart/form-data">
       		 <input type="hidden" name="bno" value="${board.boardNo}">
           <input type="text" placeholder="제목" name="title" value="${board.title}">
           <textarea placeholder="내용" name="content">${board.content}</textarea>
           <input readonly type="text" name="writer" value="${sessionScope.loginId}">
           <input type="file" name="img" style="border: none; margin: 20px 0px 20px 0px; padding: 1px;">
           <button type="submit" class="site-btn">제출</button>
       </form>
     </div>
</div>

</html>