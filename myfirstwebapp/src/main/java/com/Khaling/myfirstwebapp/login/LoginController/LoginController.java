package com.Khaling.myfirstwebapp.login.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value="login", method = RequestMethod.GET )
	public String goToLogin() {
		// model.put("name", name);
//		logger.debug("Request param is {}",name);
//		logger.info("I want this printed in info level");
		//System.out.println("Request param is : "+name);
		return "login";
	}
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, 
			@RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
}
