package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.common.SearchDTO;
import co.yedam.mapper.ReplyMapper;
import co.yedam.vo.ReplyVO;

public class ReplyServiceImpl implements ReplyService{
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	ReplyMapper mapper = sqlSession.getMapper(ReplyMapper.class);

	@Override
	public List<ReplyVO> replyList(SearchDTO search) {
		return mapper.selectListPaging(search);
	}

	@Override
	public boolean addReply(ReplyVO rvo) {
		return mapper.insertReply(rvo) == 1;
	}

	@Override
	public boolean removeReply(int replyNo) {
		return mapper.deleteReply(replyNo) == 1;
	}
	
	@Override
	public int replyTotalCnt(int totalReplyCnt) {
		return mapper.totalReplyCnt(totalReplyCnt);
	}
}
