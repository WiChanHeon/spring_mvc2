package board.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardVO;
import board.service.BoardListService;

@Controller
public class WriteController {
	private BoardListService boardListService;
	public void setBoardListService(BoardListService boardListService) {
		this.boardListService = boardListService;
	}
	@RequestMapping
	public String setView() {
		return "board/writeForm.jsp";
	}
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(HttpServletRequest request,BoardVO boardVo,BindingResult bindingResult)throws Exception {
		//글쓰기 db에 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return new ModelAndView("redirect:/board/list.do");
	}
}
