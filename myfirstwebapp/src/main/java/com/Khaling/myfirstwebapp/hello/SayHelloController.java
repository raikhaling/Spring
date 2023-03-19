package com.Khaling.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {
	
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello Welcom to my first webApp..";
	} 
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("My First Web");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First Web App html page with body");
		sb.append("</body>");
		sb.append("</html>");

	
			
		return sb.toString();
	} 
	// "say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	

}
