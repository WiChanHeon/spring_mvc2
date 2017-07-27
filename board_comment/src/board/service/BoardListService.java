package board.service;
import java.util.*;
import board.model.*;
public interface BoardListService {
	Integer getListCount(Object obj);
	List<BoardVO> getBoardList(Object obj);
	void insertWriting(BoardVO boardVo);
	BoardVO getArticle(Integer num);
	String getPass(Integer num);
	void updateArticle(BoardVO boardVo);
	void deleteArticle(Integer num);
}
