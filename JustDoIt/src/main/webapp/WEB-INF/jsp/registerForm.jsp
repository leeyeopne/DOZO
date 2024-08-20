<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 상품목록  -->
<style>
.btn-primary {
	color: white !important;
	background-color: #007bff;
	border-color: #007bff;
}

#registerButton {
  margin-top: 20px; 
  width: 360px; 
  height: 50px; 
  border-radius: 0px; 
  background-color: grey;
  cursor: not-allowed;
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
								<input type="text" id="registerId" name="registerId" autofocus>
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div style="height: 109px; display: flex; align-items: center">
								<span id="checkResult"></span>
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									비밀번호 <span>*</span>
								</p>
								<input type="password" id="registerPw" name="registerPw" placeholder="!,@,#,$,% 특수문자가 포함 되어야 합니다.">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div style="height: 109px; display: flex; align-items: center">
								<span id="check1"></span>
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									비밀번호 확인 <span>*</span>
								</p>
								<input type="password" id="registerPw2" name="registerPw2">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div style="height: 109px; display: flex; align-items: center">
								<span id="check2"></span>
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

						<div class="col-lg-6 col-md-6 col-sm-6"></div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Phone <span>*</span>
								</p>
								<input type="text" id="registerPhone" name="registerPhone" placeholder="ex)000-0000-0000">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6"></div>

						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Email <span>*</span>
								</p>
								<input type="text" id="registerEmail" name="registerEmail">
							</div>
						</div>

						<div class="col-lg-6 col-md-6 col-sm-6"></div>

						<!-- 주소 -->
						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="checkout__form__input">
								<p>
									Address<span>*</span>
								</p>
								<input type="button" onclick="sample4_execDaumPostcode()"
									value="우편번호 찾기" class="btn btn-primary" style="background-color: #000000;"> 
									<input type="text" id="sample4_roadAddress" placeholder="도로명주소"
									class="form-control mb-2" name="registerAddress1" readonly>
								<input type="text" id="sample4_extraAddress" placeholder="참고항목"
									class="form-control mb-2" name="registerAddress2" readonly>
								<input type="text" id="sample4_detailAddress" placeholder="상세주소" class="form-control mb-2" name="registerAddress3">
							</div>
							<span id="guide" style="color: #999; display: none"></span>
						</div>

					</div>
				</div>
			</div>
			<button type="submit" class="site-btn" id="registerButton">Register</button>
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

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            var roadAddr = data.roadAddress;
            var extraRoadAddr = '';

            if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
                extraRoadAddr += data.bname;
            }
            if (data.buildingName !== '' && data.apartment === 'Y') {
                extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            if (extraRoadAddr !== '') {
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_extraAddress").value = roadAddr !== '' ? extraRoadAddr : '';

            var guideTextBox = document.getElementById("guide");
            if (data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}

</script>

<script>
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('registerButton').disabled = true;

    let registerId = document.getElementById("registerId");
    let registerPw = document.getElementById('registerPw');
    let registerPw2 = document.getElementById('registerPw2');
    let registerNm = document.getElementById('registerNm');
    let registerPhone = document.getElementById('registerPhone');
    let registerEmail = document.getElementById('registerEmail');
    let registerAddress = document.getElementById('sample4_detailAddress');

    registerId.addEventListener('input', validateForm);
    registerPw.addEventListener('input', validateForm);
    registerPw2.addEventListener('input', validateForm);
    registerNm.addEventListener('input', validateForm);
    registerPhone.addEventListener('input', validateForm);
    registerEmail.addEventListener('input', validateForm);
    registerAddress.addEventListener('input', validateForm);

    async function checkId() {
        let checkResultSpan = document.getElementById("checkResult");
        if (registerId.value.length < 4 || registerId.value.length > 20) {
            checkResultSpan.innerHTML = "<font color=pink>아이디는 4자 이상, 20자 이하이어야 합니다</font>";
            return false;
        } else {
            try {
                let response = await fetch("idCheck.do?registerId=" + encodeURIComponent(registerId.value));
                if (!response.ok) throw new Error("Network response was not ok");
                
                let data = await response.json();
                if (data.retCode === "Success" && data.retVal === "ok") {
                    checkResultSpan.innerHTML = "<font color=blue>사용 가능</font>";
                    return true;
                } else {
                    checkResultSpan.innerHTML = "<font color=red>사용 불가</font>";
                    return false;
                }
            } catch (error) {
                console.error("There was a problem with the fetch operation:", error);
                checkResultSpan.innerHTML = "<font color=red>서버 오류</font>";
                return false;
            }
        }
    }

    function checkPw() {
        let pw = registerPw.value;
        let SC = ["!","@","#","$","%"];
        let check_SC = 0;

        document.getElementById('check1').innerHTML = '';
        document.getElementById('check2').innerHTML = '';

        if (pw.length < 6 || pw.length > 16) {
            document.getElementById('check1').innerHTML='비밀번호는 6글자 이상, 16글자 이하만 이용 가능합니다.';
            document.getElementById('check1').style.color='red';
            return false;
        }

        for (let i = 0; i < SC.length; i++) {
            if (pw.indexOf(SC[i]) !== -1) check_SC = 1;
        }

        if (check_SC === 0) {
            document.getElementById('check1').innerHTML='!,@,#,$,% 의 특수문자가 들어가 있지 않습니다.';
            document.getElementById('check1').style.color='red';
            return false;
        }

        if (registerPw.value !== '' && registerPw2.value !== '') {
            if (registerPw.value === registerPw2.value) {
                document.getElementById('check2').innerHTML='비밀번호가 일치합니다.';
                document.getElementById('check2').style.color='blue';
                return true;
            } else {
                document.getElementById('check2').innerHTML='비밀번호가 일치하지 않습니다.';
                document.getElementById('check2').style.color='red';
                return false;
            }
        }
        return true;
    }

    async function validateForm() {
        let idValid = await checkId();
        let pwValid = checkPw();
        let nmValid = registerNm.value.trim().length > 0;
        let phoneValid = registerPhone.value.trim().length > 0;
        let emailValid = registerEmail.value.trim().length > 0;
        let addressValid = registerAddress.value.trim().length > 0;

        console.log(`ID Valid: ${idValid}, PW Valid: ${pwValid}, Name: ${nmValid}, Phone: ${phoneValid}, Email: ${emailValid}, Address: ${addressValid}`);

        if (idValid && pwValid && nmValid && phoneValid && emailValid && addressValid) {
            document.getElementById('registerButton').disabled = false;
            document.getElementById('registerButton').style.backgroundColor = '#dc3545';
            document.getElementById('registerButton').style.cursor = 'pointer';
        } else {
            document.getElementById('registerButton').disabled = true;
            document.getElementById('registerButton').style.backgroundColor = 'grey';
            document.getElementById('registerButton').style.cursor = 'not-allowed';
        }
    }
});
</script>


