/**
 * basketModifyQuantity.js
 */

const qvc = {
    modifyBasket(cartNo, prodNo, productQuantity, loadCallback) {
        console.log(`modifyBasket called with cartNo: ${cartNo}, prodNo: ${prodNo}, productQuantity: ${productQuantity}`);

        const xhtp = new XMLHttpRequest();
        xhtp.open('GET', `modifyBasket.do?cartNo=${cartNo}&prodNo=${prodNo}&productQuantity=${productQuantity}`, true);
        xhtp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhtp.onload = loadCallback;
        xhtp.send();
    }
};

// 페이지 로드 후 이벤트 리스너 추가
document.addEventListener('DOMContentLoaded', function() {


    document.querySelectorAll('.modify-btn').forEach(button => {
        button.addEventListener('click', function() {


            // 클릭된 버튼의 부모 행에서 데이터를 찾기
            let row = button.closest('tr');
            

            let quantityInput = row.querySelector('input[name="productQuantity"]').value;
            let cartNoInput = row.querySelector('input.cartNo').value;
            let prodNoInput = row.querySelector('input.prodNo').value;



            // AJAX 요청으로 장바구니 항목 수정
            qvc.modifyBasket(cartNoInput, prodNoInput, quantityInput, function() {


                try {
                    let rs = JSON.parse(this.response);
                    console.log("Parsed response:", rs);

                    if (rs.result === 'Success') {
                        alert("수량 변경 성공하였습니다.");
                        location.reload(); // 페이지 새로고침하여 변경 사항 반영
                    } else {
                        alert("수량 변경 실패하였습니다.");
                    }
                } catch (e) {
                    console.error("JSON parsing error:", e);
                }
            });
        });
    });
});
