<%@page import="co.yedam.vo.StyleBookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
div.reply ul {
	list-style-type: none;
}

div.reply span {
	display: inline-block;
}
</style>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<a href="./index.html"><i class="fa fa-home"></i> Home</a> <a
						href="./blog.html">Blog</a> <span>Being seen: how is age
						diversity effecting change in fashion and beauty?</span>
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
						<img src="img/blog/details/blog-details.jpg" alt="">
						<div class="blog__details__item__title">
							<span class="tip">Street style</span>
							<h4>${board.title }</h4>
							<ul>
								<li>by <span>${board.writer}</span></li>
								<li>${board.writerDate}</li>
								<li>BOARD_NO:${board.boardNo}</li>
							</ul>
						</div>
					</div>
					<div class="blog__details__desc">
						<p>${board.content }</p>
					</div>


					<div class="blog__details__comment">
						<h5>3 Comment</h5>
						<a href="#" class="leave-btn">Leave a comment</a>
						<div class="blog__comment__item">
							<div class="blog__comment__item__text">
								<h6>Brandon Kelley</h6>
								<p>Duis voluptatum. Id vis consequat consetetur dissentiet,
									ceteros commune perpetua mei et. Simul viderer facilisis egimus
									tractatos splendi.</p>
								<ul>
									<li><i class="fa fa-clock-o"></i> Seb 17, 2019</li>
									<li><i class="fa fa-heart-o"></i> 12</li>
									<li><i class="fa fa-share"></i> 1</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<!-- 댓글관련 -->
<div class="container reply">
	<!-- 등록 -->
	<div class="header">
		<input class="col-sm-8" id="content">
		<button class="col-sm-3" id="addReply">댓글등록</button>
	</div>
	<!-- 목록 -->
	<div class="content">
		<ul id="replyList">
			<li style="display: none; margin-top: 10px"><span
				class="col-sm-2">12</span> <span class="col-sm-4">댓글내용</span> <span
				class="col-sm-2">user02</span> <span class="col-sm-2"><button>삭제</button></span>
			</li>
		</ul>
	</div>

	<!-- 댓글 페이징 -->
	<div class="footer">
		<nav aria-label="...">
			<ul class="pagination">
			</ul>
		</nav>
	</div>

</div>

<script>
	const bno = "${board.boardNo }"
	const replyer = "${sessionScope.loginId}"

	document.querySelector('form>table button.btn.btn-warning')
			.addEventListener('click', function(e) {
				location.href = 'modifyBoard.do?bno=${board.boardNo}';
			})
</script>

<script src="js/boardService.js"></script>
<script src="js/board.js"></script>