package co.yedam.common;

import lombok.Data;

@Data
public class SearchDTO {
	private int page;
	private int pno;
	private String searchCondition;
	private String keyword;
	private String prodCategory;
	private String prodCategory2;
	private int prodStar;
	private int bno;
}