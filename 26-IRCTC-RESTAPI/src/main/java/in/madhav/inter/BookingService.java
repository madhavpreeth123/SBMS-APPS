package in.madhav.inter;

import in.madhav.request.Passenger;
import in.madhav.response.Ticket;

public interface BookingService {

		public Ticket bookTicket(Passenger passenger);
		public Ticket getTicket(Integer ticketNum);
	}

