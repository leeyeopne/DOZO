package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class WishlistVO {
	private int wishNo;
	private int prodNo;
	private int memberNo;
	private Date wishDate;
	private String wishColor;
	private String wishSize;
	private int wishQuantity;
	
	
}
