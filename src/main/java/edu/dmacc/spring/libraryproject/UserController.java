package edu.dmacc.spring.libraryproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private static final String[] statuses = {"Platinum", "Gold", "Silver", "Bronze"};
	
	@RequestMapping(value = "/userForm")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("userForm");
		modelAndView.addObject("user", new User());
		modelAndView.addObject("statuses", statuses);

		return modelAndView;
	}

}
