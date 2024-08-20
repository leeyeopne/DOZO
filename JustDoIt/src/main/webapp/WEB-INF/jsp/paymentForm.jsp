<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Payment Form</title>
    
    <!-- 
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/json2/20150503/json2.min.js"></script>

     -->
    
</head>
<body>
    
    
        <!-- Breadcrumb Begin -->
    <div class="breadcrumb-option">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb__links">
                        <span style="font-size:25px">주문 확인</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

    <!-- Contact Section Begin -->
    <section class="contact spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="contact__content">
                        <div class="contact__address">

                            <ul>

                                <li>
                                    <h6>성함</h6>
                                    <p><span>${firstName} ${lastName}</span></p>
                                </li>

                                <li>
                                    <h6>주소 </h6>
                                    <p><span>(${Postcode}) ${Country} ${Town} ${Address}</span>
                                    
                                    </p>
                                </li>

                                                                <li>
                                    <h6>전화번호 </h6>
                                    <p>${Phone}</p>
                                </li>
                                <li>
                                    <h6>이메일 </h6>
                                    <p><span>${Email}</span></p>
                                </li>
                                <li>
                                    <h6>배송 요청사항 </h6>
                                    <p>${note}</p>
                                </li>
                                                                <li>
                                    <h6>결제한 금액</h6>
                                    <p>${cartTotal}</p>
                                </li>


                            </ul>
				<div class="cart__btn">
					<a href="http://localhost/T20240801/orderForm.do">뒤로가기</a>
				</div>                        </div>

                    </div>
                </div>

            </div>
        </div>
</section>
<!-- Contact Section End -->
    

<!-- 
    <form action="completeOrder.do" method="POST">
     -->
        <!-- 주문 상세 정보 -->
        
        
  <!-- 
        
<input type="hidden" name="orderDetails" value='${fn:escapeXml(jsonOrderList)}' />
        <input type="hidden" name="cartTotal" value="${cartTotal}" /> 
        
            -->
        
        <!-- 기타 폼 필드 및 내용 -->
  <!-- 

        <button type="submit">주문 완료</button>
    </form>

    <script>
        // JSON 데이터를 JSP에서 설정할 때 문제를 피하기 위해 JavaScript로 처리
        var jsonOrderList = '${fn:escapeXml(jsonOrderList)}';
        document.getElementById('orderDetails').value = jsonOrderList;
    </script>

            -->



</body>
</html>
