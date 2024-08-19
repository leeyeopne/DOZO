<%@ page import="co.yedam.vo.StyleBookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
div.reply ul {
	list-style-type: none;
}

div.reply span {
	display: inline-block;
}

.blog__details__item__title {
    background: #ffffff;
    padding-top: 30px;
    padding-right: 30px;
    margin-top: -100px;
    position: relative;
    margin-right: 0px;
}

.blog__details__item > img {
	width: 350px;
}

#modify, #delete {
	text-decoration: none;
	color: black;
	border: 1px solid black;
  padding: 5px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  transition: all 0.1s;
  margin-right: 5px;
}

#modify:hover {
	background-color: black;
	color: white;
}

#delete:hover {
	background-color: black;
	color: white;
}

</style>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<a href="./"><i class="fa fa-home"></i> Home</a> <a
						href="styleBookList.do">STYLE BOOK</a> <span>${board.title}</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb End -->

<!-- Blog Details Section Begin -->
<section class="blog-details spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-8">
				<div class="blog__details__content">
					<div class="blog__details__item">
						<img src=img/${board.image} alt="">
						<div class="blog__details__item__title">
							<span class="tip" style="border-radius: 0px;">Street style</span>
							<h4>${board.title }</h4>
							<ul>
								<li>by <span>${board.writer}</span></li>
								<li>${board.writerDate}</li>
								<li>BOARD_NO:${board.boardNo}</li>
							</ul>
						</div>
					</div>
					
					<div class="blog__details__desc">
						<p style="font-size: 18px;">${board.content }</p>
					</div>
					
					<c:if test="${sessionScope.loginId == board.writer}">
						<a href="updateStyleBookForm.do?bno=${board.boardNo}" id="modify">수정</a>
						<a href="deleteStyleBook.do?bno=${board.boardNo}&page=${paging.page}" id="delete">삭제</a>
					</c:if>
				
				</div>
			</div>
		</div>
	</div>
</section>

<script src="js/boardService.js"></script>
<script src="js/board.js"></script>