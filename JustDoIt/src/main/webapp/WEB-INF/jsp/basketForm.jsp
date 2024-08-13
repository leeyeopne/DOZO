<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">

		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<a href="./index.html"><i class="fa fa-home"></i> Home</a> <span>Shopping
						cart</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb End -->

<!-- Shop Cart Section Begin -->
<section class="shop-cart spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="shop__cart__table">
					<table>
						<thead>
							<tr>
								<th>Product</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
								<th></th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="basket" items="${basketList}">

								<tr>
									<td class="cart__product__item"><img
										src="${basket.product.thumbnail }" alt="">
										<div class="cart__product__item__title">
											<h6>${basket.product.prodName }</h6>
											<div class="rating">
												<c:forEach var="i" begin="1"
													end="${basket.product.prodStar}">
													<i class="fa fa-star"></i>
												</c:forEach>
												<c:forEach var="i" begin="${basket.product.prodStar + 1}"
													end="5">
													<i class="fa fa-star-o"></i>
												</c:forEach>
											</div>
										</div></td>
									<td class="cart__price">${basket.product.prodPrice }</td>
									<td class="cart__quantity">
										<div class="pro-qty">
											<input type="text" value="${basket.basketQuantity}">
										</div>
									</td>
									<td class="cart__total"></td>
									<td class="cart__close">
										<input type="hidden" name="cartNo" value="${basket.cartNo}" /> 
										<input type="hidden" name="prodNo" value="${basket.prodNo}" /> 
										<span class="icon_close"></span>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-6">
				<div class="cart__btn">
					<a href="#">Continue Shopping</a>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6">
				<div class="cart__btn update__btn">
					<a href="#"><span class="icon_loading"></span> Update cart</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-6">
				<div class="discount__content">
					<h6>Discount codes</h6>
					<form action="#">
						<input type="text" placeholder="Enter your coupon code">
						<button type="submit" class="site-btn">Apply</button>
					</form>
				</div>
			</div>
			<div class="col-lg-4 offset-lg-2">
				<div class="cart__total__procced">
					<h6>Cart total</h6>
					<ul>
						<li>Subtotal <span>$ 750.0</span></li>
						<li>Total <span>$ 750.0</span></li>
					</ul>
					<a href="#" class="primary-btn">Proceed to checkout</a>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Shop Cart Section End -->
<script src="js/basketService.js"></script>