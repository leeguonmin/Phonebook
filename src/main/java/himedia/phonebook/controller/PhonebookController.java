package himedia.phonebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhonebookController {
	private static final Logger logger = LoggerFactory.getLogger(PhonebookController.class);
	
	/* @RequestMapping(value="/", method=RequestMethod.GET) */
	@GetMapping("/")
	/* @ResponseBody */
	public String list() {
		logger.debug("PHONEBOOK LIST:");
		/* return "/WEB-INF/views/phonebook/list.jsp"; */
		return "phonebook/list";
	}
	
	
}
