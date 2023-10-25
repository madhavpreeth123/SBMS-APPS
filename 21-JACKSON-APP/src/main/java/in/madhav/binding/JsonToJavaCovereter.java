package in.madhav.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaCovereter {

	public static void main(String[] args)throws Exception {
		File f=new File("customer.json");
		ObjectMapper mapper=new ObjectMapper();
		Cutsomer c=mapper.readValue(f,Cutsomer.class);
		System.out.println(c);
	}
}
