package in.madhav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public String msg() {
		String msg="Welcome to rest api....!";
		int i=10/0;
		return msg;
	}
}
