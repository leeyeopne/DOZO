/**
 * basketService.js
 * 
 */
console.log("basketService.js");

const svc = {
    // 삭제.
    removeBasket(cartNo, loadCallback) {
        const xhtp = new XMLHttpRequest();
        xhtp.open('GET', `removeBasket.do?cartNo=${cartNo}`, true);
        xhtp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhtp.onload = loadCallback;
        xhtp.send();
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
            let cartNo = this.closest('tr').querySelector('input[name=cartNo]').value;

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



/**
 * basketService.js
 * 
 */
//console.log("basketService.js");

//const svc = {
//	// 삭제.
//	removeBasket(cartNo = 1, loadCallback) {
//		const xhtp = new XMLHttpRequest();
//		xhtp.open('get', 'removeBasket.do?cartNo=' + cartNo);// + '&content=' + param.content + '&replyer=' + param.replyer); RemoveReplyControll에서 파라미터로 값을 하나밖에 안해놨었기때문에 하나만 주는거임.
//		xhtp.send();
//		xhtp.onload = loadCallback;

//	} //end of removeBasket
//}// end of svc.



////. > 앞에 있는 부분 안이라는 의미
//// querySelector('.wishlist-btn') => 이름() > 함수
//// ' ' > 내가 찾아올 태그의 정보
//// addEventListener('이벤트방식', 함수) > 함수쓰는 목적은 해당하는 이벤트가 작동을 하면 동작을 해야하니깐 함수를 넣는것.
//	// 이벤트 방식 click > 클릭했을때 , change > 변경됐을때(input)
//document.querySelector('.cart__close').addEventListener('click',function(){
//	// document 안에 input의 name이 prodNo인 input을 선택하고(document.querySelector('input[name=prodNo]'))
//	// 그 값을 가져온다(.value).
//	let cartNo = document.querySelector('input[name=cartNo]').value;
//	let prodNo = document.querySelector('input[name=prodNo]').value;
	
//	console.log(cartNo);
//	svc.removeBasket({
//		cartNo: cartNo,
//		prodNo: prodNo
		
//		}, function() {
		
//		// 컨트롤에서 db를 등록하고 나온 결과를 받는 부분 > 결과를 보낼때 json방식으로 보냈기 때문에 JSON.parse()를 한거
//		let rs = JSON.parse(this.response);
		
//		// 컨트롤에 나온 결과를 위에서 json으로 바꾼 값을 조건에 만족하면 alert를 작동시킴.
//		if (rs.result == 'Success') {
//			// 등록완료
//			alert("삭제하였습니다.");
//		} else {
//			// 등록실패
//			alert("삭제 실패하였습니다.");
//		}
//	});
//});

