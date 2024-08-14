<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="wish" items="${Wishlist }">
								<tr>
									<td class="cart__product__item"><img
										src="img/shop/${wish.thumbnail }" alt="">
										<div class="cart__product__item__title">
											<h6>${wish.prodName}</h6>
											<div class="rating">
												<c:forEach begin="1" end="${wish.prodStar }">
													<i class="fa fa-star"></i>
												</c:forEach>
											</div>
										</div></td>
									<td class="cart__price">${wish.prodPrice}</td>
									</td>
									<td class="cart__close"><span class="icon_close"></span></td>
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