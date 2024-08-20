package co.yedam.vo;

import lombok.Data;

@Data
public class ProductInventoryVO {
	private int prodNo;
	private String prodColor;
	private int prodSize;
	private int prodQuantity;
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	public int getProdSize() {
		return prodSize;
	}
	public void setProdSize(int prodSize) {
		this.prodSize = prodSize;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

}
