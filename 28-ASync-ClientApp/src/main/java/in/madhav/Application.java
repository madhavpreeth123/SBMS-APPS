package in.madhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {
	static String GET_TICKET_URL="http://localhost:9090/ticket/{ticketNuber}";
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	WebClient web=WebClient.create();
	System.out.println("requ is sending....");
	web.get()
		.uri(GET_TICKET_URL,2)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(Application::handleReq);
	System.out.println("Req ies end>>>>");

	}
	
	public static void handleReq(String resp) {
		System.out.println(resp);
	}

}
