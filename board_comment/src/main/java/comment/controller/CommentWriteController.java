package comment.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import comment.model.CommentVO;
import comment.service.CommentWriteImpl;

public class CommentWriteController implements Controller{
	private CommentWriteImpl commentWriteImpl;
	private CommentVO comment;
	public void setCommentWriteImpl(CommentWriteImpl commentWriteImpl) {
		this.commentWriteImpl = commentWriteImpl;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		comment = new CommentVO();
		comment.setComment_id(commentWriteImpl.nextVal());
		comment.setNum(Integer.parseInt(request.getParameter("num")));
		comment.setComment_name(request.getParameter("name"));
		comment.setComment(request.getParameter("content"));
		comment.setRegdate(new Date());
		commentWriteImpl.write(comment);
		//모델생성
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("comment", comment);
		//반환값인 ModelAndView 인스턴스 생성
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/comment/write.jsp");
		modelAndView.addAllObjects(model);
		return modelAndView;
	}

}
