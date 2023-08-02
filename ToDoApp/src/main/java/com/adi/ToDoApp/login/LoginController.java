package com.adi.ToDoApp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	public String goToLogin(@RequestParam String name, ModelMap model){
		model.put("name", name);
		
//		logger.info("Request Param is {}", name);
//		logger.debug("At Debug level");
//		logger.warn("At Warn level");
		return "login";
	}

}
