package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.vo.StyleBookVO;

import co.yedam.common.DataSource;
import co.yedam.common.SearchDTO;
import co.yedam.mapper.StyleBookMapper;

public class StyleBookServiceImpl implements StyleBookService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	StyleBookMapper mapper = sqlSession.getMapper(StyleBookMapper.class);

	@Override
	public List<StyleBookVO> boardList(SearchDTO search) {
		return mapper.selectListPaging(search);
	}

	@Override
	public int totalCount(SearchDTO search) {
		return mapper.selectTotalCount(search);
	}

	@Override
	public boolean addBoard(StyleBookVO board) {
		return mapper.insertBoard(board) == 1;
	}

	@Override
	public boolean modifyBoard(StyleBookVO board) {
		return mapper.updateBoard(board) == 1;
	}

	@Override
	public boolean removeBoard(int boardNo) {
		return mapper.deleteBoard(boardNo) == 1;
	}

	@Override
	public boolean updateBoard(StyleBookVO board) {
		return mapper.updateBoard(board) == 1;
	}

	@Override
	public StyleBookVO getBoard(int boardNo) {
		return mapper.selectBoard(boardNo);
	}

}
