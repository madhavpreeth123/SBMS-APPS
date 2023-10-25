package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/welcome")
public class ControllerClass {
	
	//http:/localhost:8080/welcome/hello
	
	@GetMapping("/hello")
	public String loadPage(Model model) {
		model.addAttribute("msg", "Welcome to Spring");
		
		return "index";
	}
	
	@GetMapping("/direct")
	@ResponseBody
	public String response() {
		return "Direct Response";
	}
}
