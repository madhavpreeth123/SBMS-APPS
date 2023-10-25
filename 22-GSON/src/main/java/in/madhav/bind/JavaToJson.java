package in.madhav.bind;

import java.io.File;
import java.io.FileWriter;

import com.google.gson.Gson;
public class JavaToJson {
	public static void main(String[] args) throws Exception {
		Product p=new Product();
		p.setPid(101);
		p.setPname("mouse");
		p.setPprice(400.00);
		
		Gson gson=new Gson();
		gson.toJson(p,new FileWriter("product.json"));
	}
}
