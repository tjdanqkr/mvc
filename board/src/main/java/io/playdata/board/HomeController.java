package io.playdata.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
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
		model.addAttribute("img", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrYx9U%2Fbtq1WKBLceQ%2FtGdV1YhfvreXyEeVbltgVk%2Fimg.png&imgrefurl=https%3A%2F%2Fpearlluck.tistory.com%2F329&tbnid=Gn4FbTR1eGNSBM&vet=12ahUKEwj8pOjO0vP8AhUJEZQKHdSiBFsQMygOegUIARDXAQ..i&docid=L_-xaMzPMTNiaM&w=746&h=856&q=spring%20io&ved=2ahUKEwj8pOjO0vP8AhUJEZQKHdSiBFsQMygOegUIARDXAQ" );
		
		return "home";
	}
}
