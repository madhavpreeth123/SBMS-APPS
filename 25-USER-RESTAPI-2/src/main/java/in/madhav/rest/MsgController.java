package in.madhav.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.binding.User;

@RestController
public class MsgController {

	Map<Integer,User> mp=new HashMap<>();
	
	
	@PostMapping("/user")
	public ResponseEntity<String> loadData(@RequestBody User user){
		System.out.println(user);
		mp.put(user.getId(), user);
		return new ResponseEntity<String>("User saved!!", HttpStatus.CREATED);
	}
	
	@GetMapping("/user")
	public User getUser(@PathVariable Integer id) {
	
		User user=mp.get(id);
		return user;
	}
}
