<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>

.blog__item__text {
	padding: 10px;
    margin-right: 0px;
    background: #ffffff;
    margin-top: -54px;
    border: 1px solid #d2d2d2;
}

#addBtn {
	margin-bottom : 30px;
	background-color: black;
	color: white;
}

#addBtn:hover {
	 animation-name: push;
   animation-duration: 0.5s;
   animation-timing-function: linear;
   animation-iteration-count: 1;
}

/* Push */
@keyframes push {
  50% {
    transform: scale(.9);
  }

  100% {
    transform: scale(1);
  }
}


.blog__item {
    position: relative;
    overflow: hidden; /* 컨테이너를 넘어서는 이미지 부분을 숨깁니다 */
}

.blog__item__pic {
    width: 100%; /* 컨테이너의 너비에 맞추기 */
    height: 200px; /* 고정 높이 설정, 필요에 따라 조정 */
    background-size: cover; /* 이미지가 컨테이너를 덮도록 조정 */
    background-position: center; /* 이미지 중앙 정렬 */
    background-repeat: no-repeat; /* 이미지 반복 방지 */
    transition: transform 0.3s ease; /* 확대 효과를 부드럽게 전환 */
}

.blog__item__pic:hover {
    opacity: .5;
}

.blog__item__pic.large__item {
	height: 500px;
}

.blog__item__text {
	margin-top: 0px;
}

</style>

<!-- Blog Section Begin -->
<section class="blog spad">
      <div class="container">
	    <div class="col-lg-12 text-center">
    <c:choose>
        <c:when test="${not empty sessionScope.loginId}">
            <a href="styleBookForm.do" class="primary-btn load-btn" id="addBtn">등록</a>
        </c:when>
    </c:choose>
</div>
		<div class="row">
			<c:forEach var="board" items="${boardList}">
				<div class="col-lg-4 col-md-4 col-sm-6">
					<div class="blog__item">
						<a href="styleBookDetail.do?page=${paging.page }&bno=${board.boardNo}">
						<div class="blog__item__pic large__item set-bg" data-setbg=img/${board.image}>
						</div></a>
						<div class="blog__item__text">
							<h6>
								<a href="styleBookDetail.do?page=${paging.page }&bno=${board.boardNo}">${board.title}</a>
							</h6>
							<ul>
								<li>by <span>${board.writer}</span></li>
								<li>${board.writerDate}</li>
							</ul>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	  </div>
	</div>
</section>
<!-- Blog Section End -->

<div class="col-lg-12 text-center">
	<div class="pagination__option">
		<!-- prev 페이지 -->
		<c:if test="${paging.prev}">
			<a
				href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${paging.startPage - 1}">
				<i class="fa fa-angle-left"></i>
			</a>
		</c:if>
		<!-- 페이지 번호 링크 -->
		<c:forEach var="p" begin="${paging.startPage}" end="${paging.endPage}">
			<c:choose>
				<c:when test="${paging.page == p}">
					<a href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${p}" class="active" style="color: white; background-color: #0d0d0d;">${p}</a>
				</c:when>
				<c:otherwise>
					<a href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${p}">${p}</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<!-- next 페이지 -->
		<c:if test="${paging.next}">
			<a href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${paging.endPage + 1}">
				<i class="fa fa-angle-right"></i>
			</a>
		</c:if>
	</div>
</div>


