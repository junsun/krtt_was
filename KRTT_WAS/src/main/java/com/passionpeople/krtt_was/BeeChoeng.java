package com.passionpeople.krtt_was;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.passionpeople.krtt_was.dao.CompanyDao;
import com.passionpeople.krtt_was.dao.UserAuthDao;
import com.passionpeople.krtt_was.utils.GmailSender;
import com.passionpeople.krtt_was.vo.Company;
import com.passionpeople.krtt_was.vo.UserAuth;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BeeChoeng {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}


	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String nopage(Locale locale, Model model) {
		return "404";
	}


	@RequestMapping(value = "/portfolio", method = RequestMethod.GET)
	public String portfolio(Locale locale, Model model) {
		return "portfolio";
	}


	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String aboutus(Locale locale, Model model) {
		return "about-us";
	}


	@RequestMapping(value = "/ceo_introduction", method = RequestMethod.GET)
	public String company(Locale locale, Model model) {
		return "company/ceo_introduction";
	}

	@RequestMapping(value = "/history", method = RequestMethod.GET)
	public String history(Locale locale, Model model) {
		return "company/history";
	}


	@RequestMapping(value = "/vision", method = RequestMethod.GET)
	public String vision(Locale locale, Model model) {
		return "company/vision";
	}

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		return "company/member";
	}

	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public String location(Locale locale, Model model) {
		return "company/location";
	}
	
}
