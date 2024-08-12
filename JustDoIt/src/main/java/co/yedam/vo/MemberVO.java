package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNm;
	private String email;
	private String phone;
	private String address;
	private String address1;
	private String address2;
	private String address3;
	private Date creationDate;
}
