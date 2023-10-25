package in.madhav.service;

import in.madhav.request.Passenger;
import in.madhav.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNum);
}
