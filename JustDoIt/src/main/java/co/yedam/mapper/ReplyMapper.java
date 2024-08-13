package co.yedam.mapper;

import java.util.List;

import co.yedam.common.SearchDTO;
import co.yedam.vo.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> selectList(int boardNo); //댓글조회
	List<ReplyVO> selectListPaging(SearchDTO search); // 원본글번호, 페이지정보.
	int insertReply(ReplyVO rvo); //댓글등록
	int deleteReply(int replyNo); //댓글삭제
	int totalReplyCnt(int totalReplyCnt); //
}
