package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class OrdersVO {
	private int orderNo;
	private int memberNo;
	private int orderQuantity;
	private int orderPrice;
	private String receiver;
	private String address;
	private String orderOption;
	private String orderPhone;
	private String orderStatus;
	private Date orderDate;
	
	
}
