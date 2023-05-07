package com.encore.playdata;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.Iterator;

// maven 사용 해서 설치 
// conda install tensor
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
// @ annotation
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		model.addAttribute("hi","안녕하세요");
		List<String> genderList = new ArrayList<String>();
		genderList.add("남");
		genderList.add("여");
		model.addAttribute("genderList",genderList);
		return "test";
	}

	
	@RequestMapping(value="/insert" , method= RequestMethod.GET)
	public String insert() {
		
		return "insert";
	}
	@RequestMapping(value="/select" , method= RequestMethod.POST)
	public ModelAndView select(
//			@RequestParam("name") String name,
			@RequestParam("age") int age,
			HttpServletRequest req,
			HttpServletResponse res
			) {
		String name = (String) req.getParameter("name");
		logger.info("{}, {}", name, age);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:select");
		mav.addObject("name", name);
		mav.addObject("age", age);
		return mav;
	}
	
	@RequestMapping(value="/select" , method= RequestMethod.GET)
	public ModelAndView select(
			@RequestParam(required = false,value = "name") String name,
			@RequestParam("age") String age,
			Model model
			) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.addObject("age", age);
		mav.setViewName("select2");
		return mav;
	}
	@Autowired
	Repositorys repositorys;
	
	@RequestMapping(value="/insert2" , method= RequestMethod.POST)
	public ModelAndView insert2(
			@RequestParam(value="title") String title,
			@RequestParam(value="content") String content,
			@RequestParam(value="user") String user
			) {
		BoardDTO req = new BoardDTO(title, content, user);
		logger.info(req.toString());
		Integer insertRows = repositorys.insert(req);
		
		ModelAndView mav = new ModelAndView();
		if(insertRows==0) {
			mav.setViewName("redirect:insert2");
		}else {
			mav.setViewName("redirect:test");
		}
		return mav;
	}
	@RequestMapping(value="/insert2" , method= RequestMethod.GET)
	public String insertGet() {
		return "insert2";
	}
	@RequestMapping(value="/test2" , method= RequestMethod.GET)
	public String test2() {
		return "test2";
	}
}












