package in.madhav.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.madhav.inter.BookingService;
import in.madhav.request.Passenger;
import in.madhav.response.Ticket;

@Service
public class ServiceClassImpl implements BookingService{
	Map<Integer,Ticket> map=new HashMap<>();
	Integer ticketNum=1;
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setCost(450.0);
		t.setStatus("CONFIRMED");
		t.setTicketNuber(ticketNum);
		map.put(ticketNum, t);
		ticketNum++;
		
		return t;
	}
	@Override
	public Ticket getTicket(Integer ticketNum) {
		
		if(map.containsKey(ticketNum)) {
			return map.get(ticketNum);
		}
		
		return null;
	}
}
