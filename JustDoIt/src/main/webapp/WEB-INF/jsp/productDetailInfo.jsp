<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 상품목록  -->
<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<a href="./index.html"><i class="fa fa-home"></i> Home</a> <a
						href="#">Women’s </a> <span>${product.prodCategory }</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb End -->

<!-- Product Details Section Begin -->
<section class="product-details spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="product__details__pic">
					<div class="product__details__pic__left product__thumb nice-scroll">

						<a class="pt active" href="#product-1"> <img
							src="img/nikeimg/${product.prodImage1}" alt="">
						</a> <a class="pt" href="#product-2"> <img
							src="img/nikeimg/${product.prodImage2}" alt="">
						</a> <a class="pt" href="#product-3"> <img
							src="img/nikeimg/${product.prodImage3}" alt="">
						</a> <a class="pt" href="#product-4"> <img
							src="img/nikeimg/${product.prodImage4}" alt="">
						</a>
					</div>
					<div class="product__details__slider__content">
						<div class="product__details__pic__slider owl-carousel">
							<img data-hash="product-1" class="product__big__img"
								src="img/nikeimg/${product.prodImage1}" alt=""> <img
								data-hash="product-2" class="product__big__img"
								src="img/nikeimg/${product.prodImage2}" alt=""> <img
								data-hash="product-3" class="product__big__img"
								src="img/nikeimg/${product.prodImage3}" alt=""> <img
								data-hash="product-4" class="product__big__img"
								src="img/nikeimg/${product.prodImage4}" alt="">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="product__details__text">
					<h3>${product.prodName }
						<span style="font-size: 20px">${product.prodCategory2 }</span>
					</h3>
					<div class="rating">
						<c:forEach begin="1" end="${product.prodStar }">

							<i class="fa fa-star"></i>

						</c:forEach>

					</div>

					<div class="product__details__price" style="font-size: 25px; color: #646063">${product.prodPrice }원</div>
					<p style="font-size: 15px"></p>

					<input type="hidden" name="prodNo" value="${product.prodNo}" />
					<div class="product__details__widget">
						<ul>
							<li><span>색상:</span>
								<div class="color__checkbox">
									<label for="red"> <input type="radio"
										name="productColor" id="red" value="red" checked> <span
										class="checkmark"></span>
									</label> <label for="black"> <input type="radio"
										name="productColor" id="black" value="black"> <span
										class="checkmark black-bg"></span>
									</label> <label for="grey"> <input type="radio"
										name="productColor" id="grey" value="grey"> <span
										class="checkmark grey-bg"></span>
									</label>
								</div></li>
							<li><span>사이즈:</span>
								<div class="size__btn">
									<label for="xs-btn" class="active"> <input type="radio"
										id="xs-btn" name="productSize" value="xs"> xs
									</label> <label for="s-btn"> <input type="radio" id="s-btn"
										name="productSize" value="s"> s
									</label> <label for="m-btn"> <input type="radio" id="m-btn"
										name="productSize" value="m"> m
									</label> <label for="l-btn"> <input type="radio" id="l-btn"
										name="productSize" value="l"> l
									</label>
								</div></li>
						</ul>
					</div>


					<div class="product__details__button">
						<div class="quantity">
							<span>수량:</span>
							<div class="pro-qty">
								<input type="number" name="productQuantity" value="1">
							</div>
						</div>

						<button type="button" class="cart-btn">
							<span class="icon_bag_alt"></span> Add to cart
						</button>


						<ul>
							<li>
								<button type="button" class="wishlist-btn">
									<span class="icon_heart_alt"> </span>
								</button>

							</li>
						</ul>
					</div>

					<div class="product__details__button"></div>


				</div>
			</div>
			<div class="col-lg-12">
				<div class="product__details__tab">
					<ul class="nav nav-tabs" role="tablist">
						<li class="nav-item"><a class="nav-link active"
							data-toggle="tab" href="#tabs-1" role="tab">Description</a></li>
						<li class="nav-item"><a class="nav-link" data-toggle="tab"
							href="#tabs-3" role="tab">Reviews ( 2 )</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="tabs-1" role="tabpanel">
							<h6></h6>
							<p>${product.prodExp }</p>
						</div>
						<div class="tab-pane" id="tabs-3" role="tabpanel">
							<h6>Reviews ( 2 )</h6>
							<p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur
								aut odit aut loret fugit, sed quia consequuntur magni dolores
								eos qui ratione voluptatem sequi nesciunt loret. Neque porro
								lorem quisquam est, qui dolorem ipsum quia dolor si. Nemo enim
								ipsam voluptatem quia voluptas sit aspernatur aut odit aut loret
								fugit, sed quia ipsu consequuntur magni dolores eos qui ratione
								voluptatem sequi nesciunt. Nulla consequat massa quis enim.</p>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
								Aenean commodo ligula eget dolor. Aenean massa. Cum sociis
								natoque penatibus et magnis dis parturient montes, nascetur
								ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu,
								pretium quis, sem.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 text-center">
				<div class="related__title">
					<h5>RELATED PRODUCTS</h5>
				</div>
			</div>
			<c:forEach var="product" items="${productList }">
				<div class="col-lg-3 col-md-4 col-sm-6">
					<div class="product__item">

						<div class="product__item__pic set-bg"
							data-setbg="img/product/related/rp-1.jpg">
							<div class="label new">New</div>
							<ul class="product__hover">
								<li><a href="img/product/related/rp-1.jpg"
									class="image-popup"><span class="arrow_expand"></span></a></li>
								<li><a href="#"><span class="icon_heart_alt"></span></a></li>
								<li><a href="#"><span class="icon_bag_alt"></span></a></li>
							</ul>
						</div>
						<div class="product__item__text">
							<h6>
								<a href="#">${product.prodName}</a>
							</h6>
							<div class="rating">

								<c:forEach var="i" begin="1" end="${product.prodStar}">
									<i class="fa fa-star"></i>
								</c:forEach>
								<c:forEach var="i" begin="${product.prodStar + 1}" end="5">
									<i class="fa fa-star-o"></i>
								</c:forEach>


							</div>
							<div class="product__price">${product.prodPrice }</div>
						</div>
					</div>
				</div>
			</c:forEach>


		</div>
	</div>
</section>
<!-- Product Details Section End -->

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
<script src="js/productDetail.js"></script>