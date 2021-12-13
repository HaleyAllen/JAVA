package com.java.loginandregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.loginandregistration.models.LoginUser;
import com.java.loginandregistration.models.User;
import com.java.loginandregistration.services.UserService;

	@Controller
	public class HomeController {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("newUser", new User());
	    model.addAttribute("newLogin", new LoginUser());
	    return "login.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, 
	        BindingResult result, Model model, HttpSession session) {
	    userServ.register(newUser, result);
	    if(result.hasErrors()) {
	        model.addAttribute("newLogin", new LoginUser());
	        return "login.jsp";
	    }
	    session.setAttribute("user_id", newUser.getId());
	    return "redirect:/home";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	        BindingResult result, Model model, HttpSession session) {
	    User user = userServ.login(newLogin, result);
	    if(result.hasErrors()) {
	        model.addAttribute("newUser", new User());
	        return "login.jsp";
	    }
	    session.setAttribute("user_id", user.getId());
	    session.setAttribute("userName", user.getUserName());
	    return "redirect:/home";
		}

	@GetMapping("/home")
	public String dashboard(HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
			}		
		return "dashboard.jsp";
	}

	@GetMapping("/logout") 
		public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}