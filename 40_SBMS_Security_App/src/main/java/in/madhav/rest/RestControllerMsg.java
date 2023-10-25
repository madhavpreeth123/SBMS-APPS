package in.madhav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMsg {

	@GetMapping("/")
	public String getMsg() {
		return "Hi,Welcome to Rest API";
	}
}
