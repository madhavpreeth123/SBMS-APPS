package in.madhav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.exception.UserNotFoundException;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable Integer  id) throws Exception {
		
		if(id==100) {
			return "John";
			
		}
		else if(id==300) {
			return "madhav";
		}
		else {
			throw new UserNotFoundException("User Not Found");
		}
	}

}
