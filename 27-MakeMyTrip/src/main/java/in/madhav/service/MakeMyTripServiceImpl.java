package in.madhav.service;

import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.madhav.request.Passenger;
import in.madhav.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService{
	private String BOOK_TICKET_URL="http://localhost:9090/ticket";
	private String GET_TICKET_URL="http://localhost:9090/ticket/{ticketNuber}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		/*RestTemplate restTemp=new RestTemplate();
		ResponseEntity<Ticket> respEn=restTemp.postForEntity(BOOK_TICKET_URL, passenger,Ticket.class);
		Ticket ticket=respEn.getBody();
		return ticket;*/
		WebClient webclient=WebClient.create();
		//to send a post request with passsenger data
		//and map response to ticket object
		Ticket ticket=webclient.post()
				 .uri(BOOK_TICKET_URL)
				 .bodyValue(passenger)
				 .retrieve()
				 .bodyToMono(Ticket.class)
				 .block();
		return ticket;
	}
	
	@Override
	public Ticket getTicket(Integer ticketNum) {
		/*RestTemplate rest=new RestTemplate();
		ResponseEntity<Ticket> resp=rest.getForEntity(GET_TICKET_URL, Ticket.class, ticketNum);
		Ticket ticket=resp.getBody();
		return ticket;*/
		// to get the impl class object for webclient interface
		WebClient webclient=WebClient.create();
		//send a get request with ticket number as path parameter and get ticket object
		Ticket ticket=webclient.get()
				 .uri(GET_TICKET_URL,ticketNum)
				 .retrieve()
				 .bodyToMono(Ticket.class)
				 .block();
		return ticket;
	}
	
	
}
