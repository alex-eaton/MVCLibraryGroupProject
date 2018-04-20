package edu.dmacc.spring.libraryproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired UserDao dao;

	private static final String[] statuses = { "Platinum", "Gold", "Silver", "Bronze" };
	private static final String[] genres = {"Fiction", "Non-Fiction", "History", "Horror"};

	@RequestMapping(value = "/userForm")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("userForm");
		modelAndView.addObject("user", new User());
		modelAndView.addObject("statuses", statuses);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(User user) {
		System.out.println("in process user");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value in getName" + user.getFirstname() + " " + user.getLastname());
		dao.insertUser(user);
		modelAndView.setViewName("result");
		modelAndView.addObject("u", user);
		return modelAndView;
	}

	@RequestMapping(value = "/homePage")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("homePage");

		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllUsers")
	public ModelAndView viewAllUsers() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> allUsers = dao.getAllUsers();
		modelAndView.setViewName("viewAllUsers");
		modelAndView.addObject("all", allUsers);
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/viewAllBooks")
	public ModelAndView viewAllBooks() {
		ModelAndView modelAndView = new ModelAndView();
		List<Book> allBooks = dao.getAllBooks();
		modelAndView.setViewName("viewAllBooks");
		modelAndView.addObject("all", allBooks);
		return modelAndView;
		
	}

	@RequestMapping(value = "/bookForm")
	public ModelAndView book() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("bookForm");
		modelAndView.addObject("book", new Book());
		modelAndView.addObject("genres", genres);

		return modelAndView;
	}
	
	@Bean
	public UserDao dao() {
		UserDao bean = new UserDao();
		return bean;
	}
	
	@RequestMapping(value = "/bookresult")
	public ModelAndView processBook(Book book) {
		ModelAndView modelAndView = new ModelAndView();
	    dao.insertBook(book);
		modelAndView.setViewName("bookresult");
		modelAndView.addObject("u", book);
		return modelAndView;
	}
	
	@RequestMapping(value = "/deletebook")
	public ModelAndView deleteBook() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("deletebook");

		return modelAndView;
	}
}
