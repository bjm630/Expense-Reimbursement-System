package com.revature.DAO;

import java.util.List;

import com.revature.models.Ticket;

public interface TicketDao {
	
	//CRUD functions for database
	
	//Create
	
	boolean insertTicket(String type,String description, Double cost, Integer userID);
	
	//Read
	
	List<Ticket> viewAllTickets();
	
	List<Ticket> viewAllTicketsByApproved();
	
	List<Ticket> viewAllTicketsByDenied();
	
	List<Ticket> viewAllTicketsByPending();
	
	List<Ticket> viewAllUserTickets(Integer userID);
	
	//Update
	
	boolean changeTicketStatus (String status, Integer ticketID);

}
