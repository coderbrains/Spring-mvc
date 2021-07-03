package springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home has been fired....");
		return "home";
	}
}
