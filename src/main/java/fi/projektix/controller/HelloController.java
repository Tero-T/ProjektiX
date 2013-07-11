package fi.projektix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("name", "Tero");
		return "hello";
	}
	
	@RequestMapping("/list")
	public String addList() {
		return "list";
	}
	
}
