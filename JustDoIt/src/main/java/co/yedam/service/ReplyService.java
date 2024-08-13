package co.yedam.service;

import java.util.List;

import co.yedam.common.SearchDTO;
import co.yedam.vo.ReplyVO;

public interface ReplyService {
	List<ReplyVO> replyList(SearchDTO search); //댓글목록.
	boolean addReply(ReplyVO rvo); //댓글등록.
	boolean removeReply(int replyNo); //댓글삭제.
	
	int replyTotalCnt(int boardNo); // 댓글갯수
}
