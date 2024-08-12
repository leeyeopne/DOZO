<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 상품목록  -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
	<div class="container">
		<form action="login.do" method="post" class="checkout__form">
			<div class="row">
				<div class="col-lg-8">
					<h5>Login</h5>
					<div class="col">

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									ID <span>*</span>
								</p>
								<input type="text" name="loginId">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Password <span>*</span>
								</p>
								<input type="password" name="loginPw">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="submit" class="site-btn">Place oder</button>
		</form>
	</div>
</section>
<!-- Checkout Section End -->



<!-- Search Begin -->
<div class="search-model">
	<div class="h-100 d-flex align-items-center justify-content-center">
		<div class="search-close-switch">+</div>
		<form class="search-model-form">
			<input type="text" id="search-input" placeholder="Search here.....">
		</form>
	</div>
</div>
<!-- Search End -->
