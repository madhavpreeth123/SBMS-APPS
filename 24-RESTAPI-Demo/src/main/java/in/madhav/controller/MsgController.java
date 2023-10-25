package in.madhav.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@PostMapping("/save")
	public ResponseEntity<String> saveRecord() {
		String responseBody="msg saved successfullt!!";
		return  new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}
	@GetMapping("/welcome")
	public String getWelcome() {
		String msg="Welcome to REST API!!";
		return msg;
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String msg="HI GOOD EVENING";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
