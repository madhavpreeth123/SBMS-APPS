package in.madhav;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@GetMapping("/")
	public Customer getDteails() {
		Customer c=new Customer();
		c.setId(101);
		c.setName("madhav");
		c.setEmail("m@gamil.com"); 
		c.setPhno(678568854L);
		
		return c;
	}
}
