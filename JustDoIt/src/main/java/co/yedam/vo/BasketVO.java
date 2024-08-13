package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BasketVO {
	private int cartNo;
	private int memberNo;
	private int prodNo;
	private Date basketDate;
	private String productColor;
	private String productSize;
	private int productQuantity;
	
	
    private ProductVO product;
    public ProductVO getProduct() {
        return product;
    }

    public void setProduct(ProductVO product) {
        this.product = product;
    }

//	public double getTotalPrice() {
//        double totalPrice = 0.0;
//        try {
//            double prodPrice = Double.parseDouble(product.getProdPrice());
//            totalPrice = prodPrice * basketQuantity;
//        } catch (NumberFormatException e) {
//            // 가격 문자열이 잘못된 경우 예외 처리
//            e.printStackTrace();
//        }
//        return totalPrice;
//	}
}