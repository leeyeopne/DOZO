package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BasketVO {
	// 장바구니
	private int cartNo;
	private int memberNo;
	private Date basketDate;
	private String productColor;
	private String productSize;
	private int productQuantity;
	
	// 상품
	private int prodNo;
	private String prodName;
	private int prodPrice;
	private String prodCategory;
	private String prodImage1;
	private String prodImage2;
	private String prodImage3;
	private String prodImage4;
	private String prodExp;
	private String prodCode;
	private String thumbnail;
	private String prodCategory2;
	private int prodStar;

}