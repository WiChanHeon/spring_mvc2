package board.service;

import java.util.List;
import board.dao.BoardDao;
import board.model.BoardVO;

public class BoardListServiceImpl implements BoardListService{
	private BoardDao boardDao;
	
	public BoardDao getBoardDao() {
		return boardDao;
	}
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<BoardVO> getBoardList(Object obj){
		return this.boardDao.getList(obj);
	}
	@Override
	public Integer getListCount(Object obj) {
		return this.boardDao.getListCount(obj);
	}
	@Override
	public void insertWriting(BoardVO boardVo) {
		this.boardDao.insertArticle(boardVo);
	}
	@Override
	public BoardVO getArticle(Integer num) {
		return this.boardDao.getArticle(num);
	}
	@Override
	public void updateArticle(BoardVO boardVo) {
		this.boardDao.updateArticle(boardVo);
	}
	@Override
	public String getPass(Integer num) {
		return this.boardDao.getPass(num);
	}
	@Override
	public void deleteArticle(Integer num) {
		this.boardDao.deleteArticle(num);	
	}
}
