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
}


