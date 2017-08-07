package comment.service;

import comment.dao.CommentDao;
import comment.model.CommentVO;

public class CommentUpdateImpl implements CommentUpdateService{
	private CommentDao commentDao;
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	@Override
	public void update(CommentVO message) {
		commentDao.update(message);
	}

}
