package in.madhav.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/")
	public String LoadPage(Model model) {
		String msgTxt="Good Evening";
		
		//int i=10/0;
		//String name=null;
		//name.length();
		model.addAttribute("msg",msgTxt);
		
		return "index";
	}
	
	

}
