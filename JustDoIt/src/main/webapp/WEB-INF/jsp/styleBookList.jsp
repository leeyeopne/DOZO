<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Blog Section Begin -->
<section class="blog spad">
	<div class="container">
		<h3 style="text-align: center; margin-bottom: 60px;">STYLE BOOK</h3>
		<div class="center" style="margin-bottom: 30px;">
			<form action="boardList.do">
				<div class="row">
					<div class="col-sm-4">
						<!-- select 목록 -->
						<select name="searchCondition" class="form-control">
							<option value="">선택하세요</option>
							<option value="T" ${searchCondition == 'T' ? 'selected' : ''}>제목</option>
							<option value="W" ${searchCondition eq 'W' ? 'selected' : ''}>작성자</option>
							<option value="TW" ${searchCondition eq 'TW' ? 'selected' : ''}>제목
								& 작성자</option>
						</select>
					</div>
					<div class="col-sm-6">
						<input type="text" name="keyword" value="${keyword }"
							class="form-control">
					</div>

					<div class="col-sm-2">
						<input type="submit" value="조회" class="btn btn-primary"> <input
							type="submit" value="등록" class="btn btn-warning">
					</div>
				</div>
			</form>
		</div>
		<div class="row">
			<c:forEach var="board" items="${boardList}">
				<div class="col-lg-4 col-md-4 col-sm-6">
					<div class="blog__item">
						<div class="blog__item__pic large__item set-bg"
							data-setbg="img/blog/blog-1.jpg"></div>
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
</section>
<!-- Blog Section End -->

<div class="col-lg-12 text-center">
    <div class="pagination__option">
        <!-- prev 페이지 -->
        <c:if test="${paging.prev}">
            <a href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${paging.startPage - 1}">
                <i class="fa fa-angle-left"></i>
            </a>
        </c:if>

        <!-- 페이지 번호 링크 -->
        <c:forEach var="p" begin="${paging.startPage}" end="${paging.endPage}">
            <c:choose>
                <c:when test="${paging.page == p}">
                    <a href="styleBookList.do?searchCondition=${searchCondition}&keyword=${keyword}&page=${p}" class="active">${p}</a>
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


