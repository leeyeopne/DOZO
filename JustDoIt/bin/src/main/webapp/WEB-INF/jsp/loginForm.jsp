<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
	
	#loginBtn {
		width: 330px;
		margin-left: 30px;
		border-radius: 0px;
		background-color: grey; /* 비활성화 시의 색상 */
		cursor: not-allowed; /* 비활성화 시의 커서 */
	}
	
</style>

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
								<input type="text" name="loginId" id="loginId" oninput="validateInputs()">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Password <span>*</span>
								</p>
								<input type="password" name="loginPw" id="loginPw" oninput="validateInputs()">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="submit" class="site-btn" id="loginBtn" disabled>Login</button>
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

<script>
	function validateInputs() {
		const loginId = document.getElementById('loginId').value;
		const loginPw = document.getElementById('loginPw').value;
		const loginBtn = document.getElementById('loginBtn');
		
		if (loginId.length >= 4 && loginPw.length >= 4) {
			loginBtn.disabled = false;
			loginBtn.style.backgroundColor = '#dc3545'; // 활성화 시의 색상
			loginBtn.style.cursor = 'pointer'; // 활성화 시의 커서
		} else {
			loginBtn.disabled = true;
			loginBtn.style.backgroundColor = 'grey'; // 비활성화 시의 색상
			loginBtn.style.cursor = 'not-allowed'; // 비활성화 시의 커서
		}
	}
</script>
