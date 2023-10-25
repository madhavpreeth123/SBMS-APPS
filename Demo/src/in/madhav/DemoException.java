package in.madhav;

public class DemoException {

	public static void main(String[] args) throws Exception {

		System.out.println(getEx(200));
	}
	public static String getEx(Integer id) throws Exception {
		
		if (id==100) {
			return "madhav";
		}
		else {
			throw new Exception("UserNotFound");
		}
	}
	
}
