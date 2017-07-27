package board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardVO;
import board.service.BoardListService;

@Controller
public class UpdateArticleController {
	private BoardListService boardListService;
	public void setBoardListService(BoardListService boardListService) {
		this.boardListService = boardListService;
	}
	@RequestMapping
	public ModelAndView setView(Integer num) {
		BoardVO boardVo = this.boardListService.getArticle(num);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("vo", boardVo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/updateForm.jsp");
		mav.addAllObjects(model);
		return mav;
	}
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(HttpServletRequest request,BoardVO boardVo,BindingResult bindingResult)throws Exception {
		String pass=this.boardListService.getPass(boardVo.getNum());
		
		if(boardVo.getPass().equals(pass)) {
			this.boardListService.updateArticle(boardVo);
			return new ModelAndView("redirect:/board/list.do");
		}else {
			boardVo = this.boardListService.getArticle(boardVo.getNum());
			Map<String,Object> model = new HashMap<String,Object>();
			model.put("vo", boardVo);
			String passerror = "pass";
			model.put("value", passerror);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/board/updateForm.jsp");
			mav.addAllObjects(model);
			return mav;
		}
	}
}
