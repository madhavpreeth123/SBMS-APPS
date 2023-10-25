package in.madhav.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJasonCovertor {

	public static void main(String[] args) throws Exception {
		
		Address a =new Address();
		a.setCity("palamaner");
		a.setState("AP");
		a.setCountry("India");
		Cutsomer c=new Cutsomer();
		c.setId(101);
		c.setName("madhav");
		c.setEmail("m@gamil.com"); 
		c.setPhno(678568854L);
		c.setAddr(a);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		
	}
}
