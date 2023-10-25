package in.madhav.response;

import lombok.Data;

@Data
public class Ticket {
	
	 private Integer ticketNuber;
	 private String status;
	 private Double cost;
	 private String name;
	 private String from;
	 private String to;
	 private String doj;
	 private String trainNumber;
}
