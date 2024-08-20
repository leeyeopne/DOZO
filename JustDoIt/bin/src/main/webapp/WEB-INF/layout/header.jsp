<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Page Preloder -->
<div id="preloder">
	<div class="loader"></div>
</div>

<!-- Header Section Begin -->
<header class="header">
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-3 col-lg-2">
				<div class="header__logo">
					<a href="./"><img src="img/nikelogo5.png" alt=""></a>
				</div>
			</div>
			<div class="col-xl-6 col-lg-7">
				<nav class="header__menu">
					<ul>
						<li class="active"><a href="./index.jsp">Home</a></li>
						<li><a href="productList.do?prodCategory=top&prodCategory2=women&prodStar=0">Women’s</a>
							<ul class="dropdown">
								<li><a href="productList.do?prodCategory=top&prodCategory2=women&prodStar=0">Top</a></li>
								<li><a href="productList.do?prodCategory=bottom&prodCategory2=women&prodStar=0">pants</a></li>
								<li><a href="productList.do?prodCategory=shoes&prodCategory2=women&prodStar=0">shoes</a></li>
							</ul></li>
						<li><a href="productList.do?prodCategory=top&prodCategory2=men&prodStar=0">Men’s</a>
							<ul class="dropdown">
								<li><a href="productList.do?prodCategory=top&prodCategory2=men&prodStar=0">Top</a></li>
								<li><a href="productList.do?prodCategory=bottom&prodCategory2=men&prodStar=0">pants</a></li>
								<li><a href="productList.do?prodCategory=shoes&prodCategory2=men&prodStar=0">shoes</a></li>
							</ul></li>
						<li><a href="productList.do?prodCategory=top&prodCategory2=kids&prodStar=0">Kids</a>
							<ul class="dropdown">
								<li><a href="productList.do?prodCategory=top&prodCategory2=kids&prodStar=0">Top</a></li>
								<li><a href="productList.do?prodCategory=bottom&prodCategory2=kids&prodStar=0">Pants</a></li>
								<li><a href="productList.do?prodCategory=shoes&prodCategory2=kids&prodStar=0">shoes</a></li>
							</ul></li>
						<li><a href="styleBookList.do">STYLE BOOK</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3">
				<div class="header__right">

					<c:choose>
						<c:when test="${sessionScope.loginId == null}">
							<div class="header__right__auth">
								<a href="loginForm.do">로그인</a> <a href="registerForm.do">회원가입</a>
							</div>
						</c:when>
						<c:otherwise>
							<div class="header__right__auth">
								<a href="#">${sessionScope.loginId } 님 환영합니다</a> <a
									href="logout.do">로그아웃</a>
							</div>

							<ul class="header__right__widget">
								<li><span class="icon_search search-switch"></span></li>
								<li><a href="wishList.do?loginId=${sessionScope.loginId}"><span class="icon_heart_alt"></span>
							      	<!-- wishList 갯수 구현 -->
									<div class="tip">2</div> </a></li>
								<li><a href="#"><span class="icon_bag_alt"></span>
										<div class="tip"></div> </a></li>
							</ul>
						</c:otherwise>
					</c:choose>

				</div>
			</div>
		</div>
		<div class="canvas__open">
			<i class="fa fa-bars"></i>
		</div>
	</div>
</header>
<!-- Header Section End -->