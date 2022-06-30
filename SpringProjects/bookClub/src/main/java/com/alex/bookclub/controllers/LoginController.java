package com.alex.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.bookclub.models.Book;
import com.alex.bookclub.models.LoginUser;
import com.alex.bookclub.models.User;
import com.alex.bookclub.services.BookService;
import com.alex.bookclub.services.UserService;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;

	// RENDER LOGIN & REG
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	// REGISTER USER
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser,
			BindingResult result,
			Model model,
			HttpSession session) {
		userService.register(newUser,result);
		
		if(result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		} else {
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/home";
		}
	}
	
	//	LOGIN USER
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser loginUser, 
						BindingResult result,
						Model model,
						HttpSession session) {
		
		User user = userService.login(loginUser, result);
		
		if (result.hasErrors()) {
	        model.addAttribute("newUser", new User());
			return "index.jsp";
		} else {
			session.setAttribute("user_id", user.getId());
			return "redirect:/home";
		}
	}
	
	//	HOME ROUTE
	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
//		retrieve the user from session
		Long userId = (Long) session.getAttribute("user_id");
//		check if userId is null
		if (userId == null) {
			return "redirect:/";
		} else {
// CREATED A BOOK LIST TO CALL ALL OF THE BOOKS. NOTICE THAT I AUTOWIRED BOOKSERVICE TO HAVE ACCESS TO THE BOOKS.
			List<Book>allBooks = bookService.allBooks();
			model.addAttribute("allBooks", allBooks);
//			go to the db to retrieve the user using the id from session
			User loggedUser = userService.findOne(userId);
			model.addAttribute("loggedUser", loggedUser);			
//			m.addAttribute("thisUser", thisUser.getUserName());			
			return "home.jsp";
		}
	}
	
	// LOGOUT
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}