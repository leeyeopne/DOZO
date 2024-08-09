<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 상품목록  -->
<style>
.btn-primary {
	color: white !important;
	background-color: #007bff;
	border-color: #007bff;
}
</style>

<!-- Checkout Section Begin -->
<section class="checkout spad">
	<div class="container">
		<form action="register.do" method="post" class="checkout__form"
			id="registrationForm">
			<div class="row">
				<div class="col-lg-8">
					<h5>Register</h5>
					<div class="row">

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									ID <span>*</span>
								</p>
								<input type="text" id="registerId" name="registerId">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Password <span>*</span>
								</p>
								<input type="password" id="registerPw" name="registerPw">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Name <span>*</span>
								</p>
								<input type="text" id="registerNm" name="registerNm">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Phone <span>*</span>
								</p>
								<input type="text" id="registerPhone" name="registerPhone">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Email <span>*</span>
								</p>
								<input type="text" id="registerEmail" name="registerEmail">
							</div>
						</div>

						<!-- 주소 -->
						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Address<span>*</span>
								</p>
								<input type="button" onclick="sample4_execDaumPostcode()"
									value="우편번호 찾기" class="btn btn-primary"> <input
									type="text" id="sample4_roadAddress" placeholder="도로명주소"
									class="form-control mb-2" name="registerAddress1"> <input
									type="text" id="sample4_extraAddress" placeholder="참고항목"
									class="form-control mb-2" name="registerAddress2"> <input
									type="text" id="sample4_detailAddress" placeholder="상세주소"
									class="form-control mb-2" name="registerAddress3">
							</div>
							<span id="guide" style="color: #999; display: none"></span>
						</div>

					</div>
				</div>
			</div>
			<button type="button" onclick="registerSubmit()" class="site-btn">Register</button>
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

<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	function sample4_execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
						var roadAddr = data.roadAddress;
						var extraRoadAddr = '';

						if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
							extraRoadAddr += data.bname;
						}
						if (data.buildingName !== '' && data.apartment === 'Y') {
							extraRoadAddr += (extraRoadAddr !== '' ? ', '
									+ data.buildingName : data.buildingName);
						}
						if (extraRoadAddr !== '') {
							extraRoadAddr = ' (' + extraRoadAddr + ')';
						}

						document.getElementById("sample4_roadAddress").value = roadAddr;

						if (roadAddr !== '') {
							document.getElementById("sample4_extraAddress").value = extraRoadAddr;
						} else {
							document.getElementById("sample4_extraAddress").value = '';
						}

						var guideTextBox = document.getElementById("guide");
						if (data.autoRoadAddress) {
							var expRoadAddr = data.autoRoadAddress
									+ extraRoadAddr;
							guideTextBox.innerHTML = '(예상 도로명 주소 : '
									+ expRoadAddr + ')';
							guideTextBox.style.display = 'block';
						} else {
							guideTextBox.innerHTML = '';
							guideTextBox.style.display = 'none';
						}
					}
				}).open();
	}

	function registerSubmit() {
		let registerId = document.querySelector('#registerId');
		let registerPw = document.querySelector('#registerPw');
		let registerNm = document.querySelector('#registerNm');
		let registerPhone = document.querySelector('#registerPhone');
		let registerEmail = document.querySelector('#registerEmail');

		document.getElementById('registrationForm').submit();
	}
</script>
