package co.yedam.vo;

import co.yedam.common.SearchDTO;
import lombok.Data;


@Data
public class ProductVO extends SearchDTO{
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
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public String getProdImage1() {
		return prodImage1;
	}
	public void setProdImage1(String prodImage1) {
		this.prodImage1 = prodImage1;
	}
	public String getProdImage2() {
		return prodImage2;
	}
	public void setProdImage2(String prodImage2) {
		this.prodImage2 = prodImage2;
	}
	public String getProdImage3() {
		return prodImage3;
	}
	public void setProdImage3(String prodImage3) {
		this.prodImage3 = prodImage3;
	}
	public String getProdImage4() {
		return prodImage4;
	}
	public void setProdImage4(String prodImage4) {
		this.prodImage4 = prodImage4;
	}
	public String getProdExp() {
		return prodExp;
	}
	public void setProdExp(String prodExp) {
		this.prodExp = prodExp;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getProdCategory2() {
		return prodCategory2;
	}
	public void setProdCategory2(String prodCategory2) {
		this.prodCategory2 = prodCategory2;
	}
	public int getProdStar() {
		return prodStar;
	}
	public void setProdStar(int prodStar) {
		this.prodStar = prodStar;
	}
	
}


