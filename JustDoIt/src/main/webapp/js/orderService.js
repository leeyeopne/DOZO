/**
 * orderService.js
 */

/*
console.log("orderService.js");




// 모든 수량 입력 요소를 선택
let quantityInputs = document.querySelectorAll('input[type="number"]');

// 총액 계산 및 업데이트 함수
function updateCartTotal() {
    let total = 0;
    
    // 각 품목에 대해 총액 계산
    document.querySelectorAll('.checkout__form').forEach(row => {
        let priceElement = row.querySelector('#prodPrice');
        let quantityElement = row.querySelector('input[type="number"]');
        let totalElement = row.querySelector('#orderTotal');
        console.log(priceElement)
        console.log(quantityElement)
        console.log(totalElement)
        
        if (priceElement && quantityElement) {
            // 가격과 수량을 가져옵니다
            let priceText = priceElement.innerText;
            let quantity = parseInt(quantityElement.value);
            
            // 가격을 숫자로 변환
            let price = parseInt(priceText); // 통화 기호 제거 및 숫자로 변환
            
            // 품목의 총액을 계산
            let itemTotal = price * quantity;
            totalElement.innerText = `${parseInt(itemTotal)}`;
            
            // 장바구니 총액에 추가
            total += itemTotal;
        }
    });
    
        // 주문 요약에 총액을 업데이트
    document.getElementById('orderTotal').innerText = `${parseInt(total)}`;

    // 제품 목록을 업데이트
    updateOrderProductsList();
}
    
    
// 주문하기 버튼 클릭 시 총액을 서버로 전송
document.querySelector('.primary-btn').addEventListener('click', function() {
    let totalAmount = document.getElementById('orderTotal').innerText;

    // 총액을 서버로 전송
    const xhtp = new XMLHttpRequest();
    xhtp.open('POST', 'orderForm.do', true);
    xhtp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhtp.send(`totalAmount=${totalAmount}`);

    xhtp.onload = function() {
        if (xhtp.status >= 200 && xhtp.status < 300) {
            // 요청이 성공적으로 완료된 경우
            console.log("Order submitted successfully.");
            // 필요 시 페이지 리디렉션 또는 성공 메시지 표시
        } else {
            // 요청 실패
            console.error("Order submission failed.");
        }
    };
});

// 페이지 로드 시 초기 총액 계산
document.addEventListener('DOMContentLoaded', updateCartTotal);    
    
    
    
//    // 장바구니 총액 업데이트
//    let cartTotalElement = document.querySelector('.cart__total__procced .cartTotal');
 //   if (cartTotalElement) {
//        cartTotalElement.innerText = `${parseInt(total)}`;
//    }
    
//        // 주문 폼의 숨겨진 필드에 총액 값을 설정
//    document.getElementById('orderTotal').value = total;
//}

//// 각 수량 입력 요소에 대해 이벤트 리스너 추가
//quantityInputs.forEach(input => {
//    input.addEventListener('change', updateCartTotal);
//});

//// 페이지 로드 시 초기 총액 계산
//updateCartTotal();





























//// 모든 수량 입력 요소를 선택
//let quantityInputs = document.querySelectorAll('input[type="number"]');

//// 각 수량 입력 요소에 대해 이벤트 리스너 추가
//quantityInputs.forEach(input => {
//    input.addEventListener('change', function() {
//        let row = this.closest('tr');  // 현재 행을 찾습니다
//        let priceElement = row.querySelector('.prodPrice');
//        let totalElement = row.querySelector('.total-price');

//        // 가격과 수량을 가져옵니다
//        let priceText = priceElement.innerText;
//        let count = this.value;

//        // 가격을 숫자로 변환
//        let price = parseInt(priceText); // 통화 기호 제거 및 숫자로 변환
//        let result = price * count;

//        // 총액을 업데이트합니다
//        totalElement.innerText = `${result}`;  // 소수점 둘째 자리까지 표시
//    });
//});



//let putCntInput = document.querySelector('input[type="number"]');

//putCntInput.addEventListener('change', function(){
//	let price = document.querySelector('.prodPrice').innerText;
	
	////console.log(price);
	
//	let count = document.querySelector('input[type="number"]').value;
//	//console.log(count);
//	let result = price * count;
//	//console.log(result);
	
//	document.querySelector('.total-price').innerText = result;
//});


*/