<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
 .container input {
 	width: 500px;
 }
</style>
<div class="container">
	 <div class="contact__form">
       <h5 style="margin-top: 30px;">게시물 작성</h5>
       <form action="addStyleBook.do" method="post">
           <input type="text" placeholder="제목">
           <textarea placeholder="내용"></textarea>
           <div>작성자 : ${loginId }</div>
           <input type="file" name="img" style="border: none; margin: 20px 0px 20px 0px; padding: 1px;">
           <button type="submit" class="site-btn">제출</button>
       </form>
     </div>
</div>

</html>