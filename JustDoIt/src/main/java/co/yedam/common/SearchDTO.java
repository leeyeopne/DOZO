package co.yedam.common;

import lombok.Data;

@Data

public class SearchDTO {
	private int page;
	private int pno;
	private int bno;
	private String searchCondition;
	private String keyword;
	private String prodCategory;
	private String prodCategory2;
	private int prodStar;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
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