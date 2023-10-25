package in.madhav.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.madhav.request.Passenger;
import in.madhav.response.Ticket;
import in.madhav.service.MakeMyTripServiceImpl;

@Controller
public class MakeMyTripController {
	@Autowired
	private MakeMyTripServiceImpl service;
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("passenger",new Passenger());
		return "index";
	}
	@PostMapping("/book-ticket")
	public String bookTicket(Passenger passemger,Model model) {
		Ticket ticket=service.bookTicket(passemger);
		model.addAttribute("msg", "Ticket Booked with ticketNum:"+ticket.getTicketNuber());
		return "index";
	}
	
	@GetMapping("/ticket")
	public String ticketForm(Model model) {
		model.addAttribute("ticket",new Ticket());
		return "ticket";
	}
	@GetMapping("/ticket-get")
	public String getTicket(@RequestParam Integer ticketNum,Model model) {
		Ticket t=service.getTicket(ticketNum);
		model.addAttribute("ticket", t);
		return "ticket";
	}
	}
