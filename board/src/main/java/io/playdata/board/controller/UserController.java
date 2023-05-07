package io.playdata.board.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.playdata.board.HomeController;
import io.playdata.board.dto.UserDTO;
import io.playdata.board.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userService;
//	public UserController() {	}
//	public UserController(UserServiceImpl userService) {
//		this.userService = userService;
//	}
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value ="/user/login", method=RequestMethod.GET)
	public String getLogin(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.removeAttribute("userName");
		session.removeAttribute("userId");
		
		return "/user/login";
	}
	
	@RequestMapping(value ="/user/login", method=RequestMethod.POST)
	public ModelAndView postLogin(
			@ModelAttribute UserDTO dto,
			HttpServletRequest req
			) {
		ModelAndView mav = new ModelAndView();
		try {
			
			UserDTO user = userService.login(dto);
			mav.setViewName("redirect:/board/home");
			HttpSession session = req.getSession();
//			session.setMaxInactiveInterval(10);
			session.setAttribute("userName", user.getMemberName());
			session.setAttribute("userId", user.getMemberId());
//			mav.addObject("user", user);
		}catch (NullPointerException e) {
			mav.setViewName("redirect:/user/login123");
			mav.addObject("errCode", e.getMessage());
		}
		return mav;
	}
}
