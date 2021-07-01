package springmvc.homecontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("this is home url...");
		
		model.addAttribute("name", "Awanish kumar singh");
		
		model.addAttribute("id", 12);
		
		List<String> friends = new ArrayList<String>();
		
		friends.add("manish");
		friends.add("sunish");
		friends.add("bhawna");
		
		model.addAttribute("friends",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}
