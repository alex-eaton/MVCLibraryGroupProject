package edu.dmacc.spring.libraryproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	private static final String[] genres = {"Fiction", "Non-Fiction", "History", "Horror"};
	
	@RequestMapping(value = "/bookForm")
	public ModelAndView book() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("bookForm");
		modelAndView.addObject("book", new Book());
		modelAndView.addObject("genres", genres);

		return modelAndView;
	}
}
