package viewcontrol.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home() {
		
		return "index";
		
	}
	
	@RequestMapping(path = "processform" , method = RequestMethod.POST)
	public String process(HttpServletRequest request) {
		System.out.println("hello this is awanish kumar singh");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
		
		return "submit";
	}
	
}
