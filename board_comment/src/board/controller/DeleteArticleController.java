package board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardVO;
import board.service.BoardListService;

@Controller
public class DeleteArticleController {
	private BoardListService boardListService;
	public void setBoardListService(BoardListService boardListService) {
		this.boardListService = boardListService;
	}
	@RequestMapping
	public ModelAndView setView(Integer num) {
		ModelAndView mav = new ModelAndView("/board/deleteForm.jsp");
		mav.addObject("num",num);
		return mav;
	}
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(Integer num,BoardVO boardVo){
		String dbpass= this.boardListService.getPass(num);
		
		if(boardVo.getPass().equals(dbpass)) {
			this.boardListService.deleteArticle(boardVo.getNum());
			ModelAndView mav = new ModelAndView("/board/deleteForm.jsp");
			mav.addObject("num",num);
			mav.addObject("value","successDelete");
			return mav;
		}else {
			ModelAndView mav = new ModelAndView("/board/deleteForm.jsp");
			mav.addObject("num",num);
			mav.addObject("value","passerror");
			return mav;
		}
	}
}
