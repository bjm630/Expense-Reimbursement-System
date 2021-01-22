package com.revature.junitTests;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.DAO.TicketDao;
import com.revature.DAO.TicketDaoImp;
import com.revature.service.TicketService;
import com.revature.service.TicketServiceImp;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TestViewTickets {
	
	@Mock
	TicketService uServ;
	
	@Mock
	TicketDao uDao;
	
	@InjectMocks
	TicketServiceImp tServImp = new TicketServiceImp();
	TicketDaoImp tDaoImp = new TicketDaoImp();
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_all_pass() {
		
		boolean expected = false;
		boolean actual = tServImp.viewAllTickets().isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_denied_pass() {
		
		boolean expected = false;
		boolean actual = tServImp.viewAllTicketsByDenied().isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_approved_pass() {
		
		boolean expected = false;
		boolean actual = tServImp.viewAllTicketsByApproved().isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_pending_pass() {
		
		boolean expected = false;
		boolean actual = tServImp.viewAllTicketsByPending().isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_user_pass() {
		
		Integer userID = 1;
		
		boolean expected = false;
		boolean actual = tServImp.viewAllUserTickets(userID).isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_view_user_fail() {
		
		Integer userID1 = 1000;
		
		boolean expected = true;
		boolean actual = tServImp.viewAllUserTickets(userID1).isEmpty();
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_change_status_pass() {
		
		Integer ticketID = 1;
		String status = "approved";
		
		boolean expected = true;
		boolean actual = tServImp.changeTicketStatus(status, ticketID);
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_change_status_fail() {
		
		Integer ticketID = 1000;
		String status = "approved";
		
		boolean expected = false;
		boolean actual = tServImp.changeTicketStatus(status, ticketID);
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_insert_ticket_pass() {
		
		Integer userID = 1;
		String type = "LODGING";
		String description = "Test";
		Double cost = 100.00;
		
		boolean expected = true;
		boolean actual = tServImp.insertTicket(type, description, cost, userID);
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_insert_ticket_fail() {
		
		Integer userID = 1000;
		String type = "LODGING";
		String description = "Test";
		Double cost = 100.00;
		
		boolean expected = false;
		boolean actual = tServImp.insertTicket(type, description, cost, userID);
		Assert.assertEquals(expected, actual);
		}
	
	
	
	

}
