package board.service;

import java.util.List;

import board.dao.BoardDao;
import board.model.BoardVO;

public class BoardListServiceImpl implements BoardListService{

	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public List<BoardVO> getBoardList(Object obj) {
		// TODO Auto-generated method stub
		return this.boardDao.getList(obj);
	}
	
	@Override
	public Integer getListCount(Object obj) {
		// TODO Auto-generated method stub
		return this.boardDao.getListCount(obj);
	}
}
