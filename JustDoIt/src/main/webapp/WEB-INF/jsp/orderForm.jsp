<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Breadcrumb Begin -->
<div class="breadcrumb-option">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb__links">
					<span style="font-size:25px">주문</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
	<div class="container">

<form action="paymentForm.do" method="POST" class="checkout__form">
    <div class="row">
        <div class="col-lg-8">
            <h5>배송 옵션</h5>
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="checkout__form__input">
                        <p class="firstName">성 <span>*</span></p>
                        <input type="text" name="firstName" value="${firstName}" />
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="checkout__form__input">
                        <p class="lastName">이름 <span>*</span></p>
                        <input type="text" name="lastName" value="${lastName}" />
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="checkout__form__input">
                        <p class="Country">도/광역시 <span>*</span></p>
                        <input type="text" name="Country" value="${Country}" />
                    </div>
                    <div class="checkout__form__input">
                        <p class="Town">시 또는 구/군 (예시: 강남구) <span>*</span></p>
                        <input type="text" name="Town" value="${Town}" />
                    </div>
                    <div class="checkout__form__input">
                        <p class="Address">상세 주소 <span>*</span></p>
                        <input type="text" name="Address" value="${Address}" placeholder="상세 주소" />

                    </div>
                    <div class="checkout__form__input">
                        <p class="Postcode">우편번호 <span>*</span></p>
                        <input type="text" name="Postcode" value="${Postcode}" />
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="checkout__form__input">
                        <p class="Phone">전화번호 <span>*</span></p>
                        <input type="text" name="Phone" value="${Phone}" />
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="checkout__form__input">
                        <p class="Email">이메일 <span>*</span></p>
                        <input type="text" name="Email" value="${Email}" />
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="checkout__form__input">
                        <p class="note">배송 요청사항 <span>*</span></p>
                        <input type="text" name="note" value="${note}" placeholder="배송 요청사항을 적어주세요." />
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="checkout__order">
                <h5>장바구니 내역</h5>
                <div class="checkout__order__product">
                    <ul id="orderProductLists">
                        <li><span class="top__text">상품</span><span class="top__text__right">가격</span></li>
                        <c:forEach var="order" items="${orderList}">
                            <li>${order.prodName}<span>${order.prodPrice * order.productQuantity}</span></li>
                        					<input type="hidden" name="prodPrice" value="${prodPrice}" />
					<input type="hidden" name="cartTotal" value="${cartTotal}" />

                        </c:forEach>
                    </ul>
                </div>
					<div class="checkout__order__total">
						<ul>



							<li>총 결제 금액 <span class="cartTotal">${cartTotal}원</span></li>



						</ul>
					</div>
					<div class="checkout__order__widget">

						<label for="check-payment"> 만나서 직접 결제 <input
							type="checkbox" id="check-payment"> <span
							class="checkmark"></span>
						</label> <label for="paypal"> 계좌이체 (농협은행 : 352-1234-1234-12 )<input type="checkbox"
							id="paypal"> <span class="checkmark"></span>
						</label>
					</div>
										<input type="hidden" name="prodName" value="${prodName}" />
					<button type="submit" class="site-btn">주문</button>
				</div>
			</div>
</div>

		</form>
	</div>
</section>
<!-- Checkout Section End -->
<!-- 

<script src="js/orderService.js"></script>
 -->
