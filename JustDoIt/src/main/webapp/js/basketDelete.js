/**
 * basketDelete.js
 */
console.log("basketDelete.js");


const svc = {
	// 삭제.
	removeBasket(cartNo, loadCallback) {
		const xhtp = new XMLHttpRequest();
		xhtp.open('GET', `removeBasket.do?cartNo=${cartNo}`, true);
		xhtp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

		xhtp.send();
				xhtp.onload = loadCallback;
	}
};

// 예시: 페이지 로드 후 이벤트 리스너 추가
document.addEventListener('DOMContentLoaded', function() {
	// document.addEventListener('DOMContentLoaded', function() { ... });
	// 웹 페이지의 DOM(문서 객체 모델)이 완전히 로드되고 파싱된 후에 실행될 코드를 작성할 때 사용하는 이벤트 리스너
	document.querySelectorAll('.cart__close').forEach(button => {
		// 그냥 querySelector로 하면 첫번째 것만 됨.
		button.addEventListener('click', function() {
			// 현재 버튼에서 cartNo 값을 찾기
			let cartNo = document.querySelector('input[name=cartNo]').value;
console.log(cartNo);
			// AJAX 요청으로 장바구니 항목 삭제
			svc.removeBasket(cartNo, function() {
				let rs = JSON.parse(this.response);

				if (rs.retCode === 'Success') {
					alert("삭제하였습니다.");
					location.reload(); // 페이지 새로고침하여 변경 사항 반영
				} else {
					alert("삭제 실패하였습니다.");
				}
			});
		});
	});
});





