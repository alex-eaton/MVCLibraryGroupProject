package edu.dmacc.spring.libraryproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@Autowired BookDao dao;
	
	private static final String[] genres = {"Fiction", "Non-Fiction", "History", "Horror"};
	
	@RequestMapping(value = "/bookForm")
	public ModelAndView book() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("bookForm");
		modelAndView.addObject("book", new Book());
		modelAndView.addObject("genres", genres);

		return modelAndView;
	}
	
	@RequestMapping(value = "/bookresult")
	public ModelAndView processBook(Book book) {
		ModelAndView modelAndView = new ModelAndView();
	    dao.insertBook(book);
		modelAndView.setViewName("bookresult");
		modelAndView.addObject("u", book);
		return modelAndView;
	}
	
	@Bean
	public BookDao dao() {
		BookDao bean = new BookDao();
		return bean;
	}
	
}
