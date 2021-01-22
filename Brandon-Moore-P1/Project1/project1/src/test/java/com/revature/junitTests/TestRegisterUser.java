package com.revature.junitTests;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.revature.DAO.UserDao;
import com.revature.DAO.UserDaoImp;
import com.revature.service.UserService;
import com.revature.service.UserServiceImp;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TestRegisterUser {
	
	@Mock
	UserService uServ;
	
	@Mock
	UserDao uDao;
	
	@InjectMocks
	UserServiceImp uServImp = new UserServiceImp();
	UserDaoImp uDaoImp = new UserDaoImp();
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	String firstname = "firstname";
	String lastname = "firstname";
	String username = "he";
	String password = "firstname";
	String username1 = "brandon";
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_register_user_pass() {
		
		boolean expected = true;
		boolean actual = uServImp.registerUser(firstname, lastname, username, password);
		Assert.assertEquals(expected, actual);
		}

	@SuppressWarnings("deprecation")
	@Test
	public void test_register_user_fail() {
		
		boolean expected1 = false;
		boolean actual1 = uServImp.registerUser(firstname, lastname, username1, password);
		Assert.assertEquals(expected1, actual1);
	}
}
