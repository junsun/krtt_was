package com.passionpeople.krtt_was;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.passionpeople.krtt_was.utils.GmailSender;

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
		
		return "home";
	}
	
	
	@RequestMapping(value = "/SEND_MAIL", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> sendMail(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("RESULT", "SUCCESS");
		
		GmailSender sender = new GmailSender("passion.people.krtt@gmail.com", "wnstjs86");
		try {
			sender.sendMail(
					"메일제목 !!", 
					"메일 본문입니다..~~ ", 
					"passion.people.krtt@gmail.com", 
					paramMap.get("MAIL_TO")
			);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return resultMap;
	}
	
	
	@RequestMapping(value = "/AJAX/costs_elec_yearly_list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> ajaxCostsElecYearlyList(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		return resultMap;
	}
	
}
