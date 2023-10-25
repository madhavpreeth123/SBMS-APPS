package in.madhav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondMsgController {

	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("msg", "Hello,How are you!");
		int i=10/0;
		return "index";
	}
}
