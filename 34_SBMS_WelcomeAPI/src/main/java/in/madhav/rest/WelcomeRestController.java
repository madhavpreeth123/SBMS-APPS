package in.madhav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.madhav.feign.GreetFienClinet;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFienClinet cl;
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		/*RestTemplate rt=new RestTemplate();
		ResponseEntity<String> res=rt.getForEntity("http://localhost:8081/greet",String.class);
		String greetRes=res.getBody();
		return greetRes+", Welcome";*/
		//drawaback--hardcodeurl
		
		
		String msg=cl.invokeGreetApi();
		return msg+", welcome";
	}
}
