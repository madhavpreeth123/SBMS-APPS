package in.madhav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.req.ReqCustomer;
import in.madhav.response.PhoneResponse;
import in.madhav.service.ServiceInter;

@RestController
public class PhoneBookResr {
	@Autowired
	private ServiceInter service;
	@PostMapping("/data")
	public ResponseEntity<PhoneResponse> saveData(@RequestBody ReqCustomer rc) {
		PhoneResponse pr=service.saveData(rc);
		
		return new ResponseEntity<>(pr,HttpStatus.CREATED);
	}
	
	@GetMapping("/data/{uId}")
	public PhoneResponse getData(@PathVariable Integer uId) {
		return service.getData(uId);
	}
}
