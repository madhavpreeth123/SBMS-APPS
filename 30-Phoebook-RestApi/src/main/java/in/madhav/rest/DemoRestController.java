package in.madhav.rest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.repo.UserRepositery;
import in.madhav.req.UserData;
import in.madhav.response.UserResponse;


@RestController
public class DemoRestController {
	
	@Autowired
	private UserRepositery repo;
	
	@PostMapping("/saveUser")
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserData ud){
		UserResponse ur=new UserResponse();
		
		BeanUtils.copyProperties(ud, ur);
		ur.setWhen(LocalDateTime.now());
		ur.setStatus("SAVED");	
		repo.save(ur);
		return new ResponseEntity<>(ur,HttpStatus.CREATED);
	}
	
	@GetMapping("/getuser/{phoneNum}")
	public ResponseEntity<UserResponse> getUser(@PathVariable String phoneNum) {
	    List<UserResponse> ur = repo.getUser(phoneNum);
	    
	    // Check if the list is not empty and contains at least one UserResponse
	    if (!ur.isEmpty()) {
	        // You can return the first element of the list since you expect only one result
	        UserResponse user = ur.get(0);
	        return ResponseEntity.ok(user);
	    } else {
	        // If no results are found, return a 404 Not Found response
	        return ResponseEntity.notFound().build();
	    }
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<List<UserResponse>> getAllUser() {
	    List<UserResponse> ur = repo.findAll();
	    //System.out.println("Number of users retrieved: " + ur.size());
	    return new ResponseEntity<>(ur, HttpStatus.OK);
	}
	
	 @GetMapping("/finduser/{phoneNum}")
	    public ResponseEntity<UserResponse> getUserIdByPhoneNum(@PathVariable String phoneNum) {
	      Integer id= repo.getUserIdByPhoneNum(phoneNum);
	      Optional<UserResponse> optuser=repo.findById(id);
	      if(optuser.isPresent()) {
	    	  return new ResponseEntity<>(optuser.get(),HttpStatus.CREATED);
	      }
	      else {
	    	  return ResponseEntity.notFound().build();
	      }
	      
	 }
	 
	 @PostMapping("/deleteUser/{phoneNum}")
	 public String update(@PathVariable String phoneNum) {
		Integer id= repo.getUserIdByPhoneNum(phoneNum);
		if(id!=null) {
		repo.deleteById(id);
		return "deleted";
		}
		return "id not present";
		 
	 }
}



	
