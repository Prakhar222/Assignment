package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		
		System.out.println("this is home url");
		model.addAttribute("name","Prakhar");
		model.addAttribute("id",2222);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("this is about controller");
		return "about";
		
	}
	
}
