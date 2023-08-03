package com.adi.ToDoApp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String goToLogin(){
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, 
			ModelMap model){
		if(authenticationService.isAuthenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		};
		model.put("error", "Invalid Credentials ! please try again");
		return "login";
	}

}
