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
public class TestManagerLogin {
	
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
	
	String username = "brandon";
	String password = "moore";
	String password1 = "moore1";
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_manager_login_pass() {
		
		boolean expected = true;
		boolean actual = uServImp.managerLogin(username, password);
		Assert.assertEquals(expected, actual);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_manager_login_fail() {
		
		boolean expected = false;
		boolean actual = uServImp.managerLogin(username, password1);
		Assert.assertEquals(expected, actual);
		}

}
