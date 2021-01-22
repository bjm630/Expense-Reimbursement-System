package com.revature.service;

import java.util.List;

import com.revature.models.Ticket;

public interface TicketService {
	
	public boolean insertTicket(String type,String description, Double cost, Integer userID);
	
	public List<Ticket> viewAllTickets();
	
	public List<Ticket> viewAllTicketsByApproved();
	
	public List<Ticket> viewAllTicketsByDenied();
	
	public List<Ticket> viewAllTicketsByPending();
	
	public List<Ticket> viewAllUserTickets(Integer userID);
	
	public boolean changeTicketStatus(String status,Integer ticketID);
	

}
