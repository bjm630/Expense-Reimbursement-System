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
import com.revature.DAO.UserDao;
import com.revature.DAO.UserDaoImp;
import com.revature.service.TicketService;
import com.revature.service.TicketServiceImp;
import com.revature.service.UserService;
import com.revature.service.UserServiceImp;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TestInsertTicket {
	
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
	
	String type = "LODGING";
	String description = "Test";
	Double cost = 100.00;
	Integer userID = 2;
	Integer userID1 = 180;
	
//	@SuppressWarnings("deprecation")
//	@Test
//	public void test_insert_ticket_pass() {
//		
//		boolean expected = true;
//		boolean actual = tServImp.insertTicket(type, description, cost, userID);
//		Assert.assertEquals(expected, actual);
//		}
//	
//	@SuppressWarnings("deprecation")
//	@Test
//	public void test_insert_ticket_fail() {
//		
//		boolean expected = false;
//		boolean actual = tServImp.insertTicket(type, description, cost, userID1);
//		Assert.assertEquals(expected, actual);
//		}

}
