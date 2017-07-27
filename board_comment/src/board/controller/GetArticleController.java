package board.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardVO;
import board.service.BoardListService;

@Controller
public class GetArticleController {
	private BoardListService boardListService;
	public void setBoardListService(BoardListService boardListService) {
		this.boardListService = boardListService;
	}
	@RequestMapping
	public ModelAndView getArticle(Integer num) {
		BoardVO boardVo = this.boardListService.getArticle(num);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("vo", boardVo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/content.jsp");
		mav.addAllObjects(model);
		return mav;
	}
}
