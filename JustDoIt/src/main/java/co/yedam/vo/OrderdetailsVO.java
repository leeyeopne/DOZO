package co.yedam.vo;

import lombok.Data;

@Data
public class OrderdetailsVO {
	private int orderNo;
	private int memberNo;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	
}
