package com.passionpeople.krtt_was;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.io.IOUtils;
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
import com.passionpeople.krtt_was.dao.CompanyLikeDao;
import com.passionpeople.krtt_was.dao.UserAuthDao;
import com.passionpeople.krtt_was.utils.GmailSender;
import com.passionpeople.krtt_was.vo.Company;
import com.passionpeople.krtt_was.vo.CompanyLiked;
import com.passionpeople.krtt_was.vo.UserAuth;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserAuthDao userAuthDao;

	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private CompanyLikeDao companyLikeDao;
	
	@Value("#{'resources/image/'}")
	private Resource resource;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/json_template", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "json_template";
	}
	
	
	@RequestMapping(value = "/SEND_MAIL", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> sendMail(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("RESULT", "SUCCESS");
		int authNum = (int)Math.floor((Math.random() * 10000) + 1);
		String authNumStr = String.format("%04d", authNum);
		
		GmailSender sender = new GmailSender("passion.people.krtt@gmail.com", "naver!@#123");
		try {
			sender.sendMail(
					"[KRTT] 사용자 인증", 
					"인증번호 : " + authNumStr, 
					"passion.people.krtt@gmail.com", 
					paramMap.get("MAIL_TO")
			);
			
			userAuthDao.insert(new UserAuth(paramMap.get("MAIL_TO"), authNumStr));
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return resultMap;
	}
	
	
	@RequestMapping(value = "/CAMPANY_LIST", method = RequestMethod.GET)
	@ResponseBody
	public List<Company> companyList(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		return companyDao.getCompanyList();
	}
	
	
	@RequestMapping(value = "/CHECK_AUTH", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> checkAuth(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("RESULT", userAuthDao.getUserByEmail(paramMap.get("MAIL_TO")).getAuthId().equals(paramMap.get("AUTH_ID")));
		return resultMap;
	}
	
	
	@RequestMapping(value = "/COMPANY_LIKED_LIST", method = RequestMethod.GET)
	@ResponseBody
	public List<HashMap<String, Object>> companyLikedList(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap;
		ArrayList<HashMap<String, Object>> resultList = new ArrayList<HashMap<String, Object>>();
		
		for(CompanyLiked iterator : companyLikeDao.getCompanyList(paramMap.get("EMAIL"))){
			resultMap = new HashMap<String, Object>();
			resultMap.put("CP_ID", iterator.getCpId());
			resultList.add(resultMap);
		}
		
		return resultList;
	}
	
	@RequestMapping(value = "/COMPANY_LIKED_ADD", method = RequestMethod.GET)
	@ResponseBody
	public List<HashMap<String, Object>> companyLikedAdd(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap;
		ArrayList<HashMap<String, Object>> resultList = new ArrayList<HashMap<String, Object>>();
		companyLikeDao.insert(new CompanyLiked(paramMap.get("CP_ID"), paramMap.get("EMAIL")));
		
		for(CompanyLiked iterator : companyLikeDao.getCompanyList(paramMap.get("EMAIL"))){
			resultMap = new HashMap<String, Object>();
			resultMap.put("CP_ID", iterator.getCpId());
			resultList.add(resultMap);
		}
		
		return resultList;
	}
	
	@RequestMapping(value = "/COMPANY_LIKED_RMV", method = RequestMethod.GET)
	@ResponseBody
	public List<HashMap<String, Object>> companyLikedRemove(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		ArrayList<HashMap<String, Object>> resultList = new ArrayList<HashMap<String, Object>>();
		companyLikeDao.remove(paramMap.get("CP_ID"), paramMap.get("EMAIL"));
		
		for(CompanyLiked iterator : companyLikeDao.getCompanyList(paramMap.get("EMAIL"))){
			resultMap = new HashMap<String, Object>();
			resultMap.put("CP_ID", iterator.getCpId());
			resultList.add(resultMap);
		}
		
		return resultList;
	}
	
	
	@RequestMapping(value = "/IMG_DOWN", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<byte[]> IMG_DOWN(Locale locale, Model model, @RequestParam Map<String, String> paramMap) throws IOException {
		InputStream in = resource.createRelative(paramMap.get("IMG_NM")).getInputStream();
 
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.IMAGE_JPEG);
 
			return new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.OK);
		} finally {
			IOUtils.closeQuietly(in);
		}
	}
	
	
	@RequestMapping(value = "/AJAX/costs_elec_yearly_list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> ajaxCostsElecYearlyList(Locale locale, Model model, @RequestParam Map<String, String> paramMap) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		return resultMap;
	}
	
}
