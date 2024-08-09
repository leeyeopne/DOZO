<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 상품목록  -->

<!-- 본문 위 경로 표시 -->
<div class="breadcrumb-option">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<a href="./index.html"><i class="fa fa-home"></i> Home</a> <span>Shop</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- 본문 위 경로 표시 End -->

<!-- 본문 시작 -->
<section class="shop spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-3">
				<div class="shop__sidebar">
					<div class="sidebar__categories">
						<div class="section-title">
							<h4>Categories</h4>
						</div>
						<div class="categories__accordion">
							<div class="accordion" id="accordionExample">
								<div class="card">
									<div class="card-heading active">
										<a data-toggle="collapse" data-target="#collapseOne">Women</a>
									</div>
									<div id="collapseOne" class="collapse show"
										data-parent="#accordionExample">
										<div class="card-body">
											<ul>
												<li><a href="productList.do?cate1=Top&cate2=Women">Top</a></li>
												<li><a href="productList.do?cate1=Bottom&cate2=Women">Bottom</a></li>
												<li><a href="productList.do?cate1=Shoes&cate2=Women">Shoes</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseTwo">Men</a>
									</div>
									<div id="collapseTwo" class="collapse"
										data-parent="#accordionExample">
										<div class="card-body">
											<ul>
												<li><a href="productList.do?cate1=Top&cate2=Men">Top</a></li>
												<li><a href="productList.do?cate1=Bottom&cate2=Men">Bottom</a></li>
												<li><a href="productList.do?cate1=Shoes&cate2=Men">Shoes</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseThree">Kids</a>
									</div>
									<div id="collapseThree" class="collapse"
										data-parent="#accordionExample">
										<div class="card-body">
											<ul>
												<li><a href="productList.do?cate1=Top&cate2=Kids">Top</a></li>
												<li><a href="productList.do?cate1=Bottom&cate2=Kids">Bottom</a></li>
												<li><a href="productList.do?cate1=Shoes&cate2=Kids">Shoes</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseFive">Best Collection</a>
									</div>
									<div id="collapseFive" class="collapse"
										data-parent="#accordionExample">
										<div class="card-body">
											<ul>

											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					
				</div>
			</div>
			<!-- 중앙페이지 -->
			<div class="col-lg-9 col-md-9">
				<div class="row">
					<c:forEach var="product" items="${productList }">
						<div class="col-lg-4 col-md-6">
							<div class="product__item">
								<div class="product__item__pic set-bg"
									data-setbg="img/shop/${product.prodImage }">
									<!--  <div class="label new">New</div>-->
									<ul class="product__hover">
										<li><a href="img/shop/" class="image-popup"> <span class="arrow_expand"></span>
										</a></li>
										<li><a href="#"><span class="icon_heart_alt"></span></a></li>
										<li><a href="#"><span class="icon_bag_alt"></span></a></li>
									</ul>
								</div>
								<div class="product__item__text">
									<h6>
										<a href="#">${product.prodName}</a>
									</h6>
									
									<div class="rating">
									<c:forEach begin="1" end="${product.prodStar }">									
										<i class="fa fa-star"></i> 
									</c:forEach>
									</div>
									
									<div class="product__price">${product.prodPrice }</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>

			<div class="col-lg-12 text-center">
				<div class="pagination__option">
					<a href="#">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#"><i
						class="fa fa-angle-right"></i></a>
				</div>
			</div>
		</div>
	</div>
	</div>
	</div>
</section>
<!-- 본문 End -->

<!-- Instagram Begin -->
<div class="instagram">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-1.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-2.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-3.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-4.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-5.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-4 p-0">
				<div class="instagram__item set-bg"
					data-setbg="img/instagram/insta-6.jpg">
					<div class="instagram__text">
						<i class="fa fa-instagram"></i> <a href="#">@ ashion_shop</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Instagram End -->