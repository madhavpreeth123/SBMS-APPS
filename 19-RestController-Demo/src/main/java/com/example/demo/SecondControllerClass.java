package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greet")
public class SecondControllerClass {
	
	@GetMapping(value={"/hello","hi"})
	@ResponseBody
	public String msg() {
		return "hello";
	}

}
