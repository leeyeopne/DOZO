package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class WishlistVO extends ProductVO {
	private int wishNo;
	private int prodNo;
	private int memberNo;
	private Date wishDate;
//	private String wishColor;
//	private String wishSize;
//	private int wishQuantity;
//	private String wishProduct;
	public int getWishNo() {
		return wishNo;
	}
	public void setWishNo(int wishNo) {
		this.wishNo = wishNo;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public Date getWishDate() {
		return wishDate;
	}
	public void setWishDate(Date wishDate) {
		this.wishDate = wishDate;
	}
	
	
}
