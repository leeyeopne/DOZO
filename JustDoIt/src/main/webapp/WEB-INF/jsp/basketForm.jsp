<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">

		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<span style="font-size:25px">장바구니</span>
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
								<th>제품</th>
								<th>가격</th>
								<th>수량</th>
								<th>총 가격</th>
								<th></th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="basket" items="${basketList}">
								<tr>
									<td class="cart__product__item"><img style="width: 100px"
										src="${basket.thumbnail}" alt="">
										<div class="cart__product__item__title">
											<h6 style="font-size: 20px">${basket.prodName}</h6>
											<div class="rating">
												<c:forEach var="i" begin="1" end="${basket.prodStar}">
													<i class="fa fa-star"></i>
												</c:forEach>
												<c:forEach var="i" begin="${basket.prodStar + 1}" end="5">
													<i class="fa fa-star-o"></i>
												</c:forEach>
											</div>
										</div></td>
									<td class="cart__price"><span class="prodPrice">${basket.prodPrice}</span>
									</td>
									<td class="cart__quantity">
										<div class="pro-qty" style="mwidth: 100px;">
											<input type="number" name="productQuantity"
												value="${basket.productQuantity}">
										</div>
										<button style="width: 50px; font-size: 15px;" class="modify-btn" type="submit">
											수정</button>
									</td>
									<td class="cart__total"><input type="hidden"
										class="cartNo" name="cartNo" value="${basket.cartNo}" /> <input
										type="hidden" class="prodNo" value="${basket.prodNo}" /> <input
										type="hidden" class="prodPrice" value="${basket.prodPrice}" />
										<span class="total-price">${basket.prodPrice * basket.productQuantity}</span>
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
					<a href="http://localhost/T20240801/">쇼핑 계속하기</a>
				</div>
			</div>




			<div class="col-lg-4 offset-lg-2">
				<div class="cart__total__procced" style="width: 300px">
					<h6 style="font-size: 20px">주문 내역</h6>
					<ul>
						<li>총 결제 금액 <span class="cartTotal"></span></li>
					</ul>
					<form action="orderForm.do" method="post">
						<input type="hidden" name="cartNo" value="${basket.cartNo}" /> <input
							type="hidden" name="prodNo" value="${basket.prodNo}" /> <input
							type="hidden" class="prodPrice" value="${basket.prodPrice}" /> <input
							type="hidden" class="cartTotal" value="${cartTotal}" />



						<button style="width: 200px; background-color:black" class="primary-btn" type="submit">
							주문하기</button>

					</form>
				</div>
			</div>

		</div>
	</div>
</section>
<!-- Shop Cart Section End -->
<script src="js/basketDelete.js"></script>

<script src="js/basketTotal.js"></script>
<script src="js/basketModifyQuantity.js"></script>
