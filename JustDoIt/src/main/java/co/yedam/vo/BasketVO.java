package co.yedam.vo;



import java.util.Date;

import lombok.Data;

@Data
public class BasketVO {
	private int cartNo;
	private int memberNo;
	private int prodNo;
	private Date basketDate;

}
