package com.revature.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.revature.DAO.UserDaoImp;
import com.revature.models.User;

public class UserServiceImp implements UserService {

	private static UserService userServiceImp = new UserServiceImp();
	
	private static Logger log = LogManager.getLogger(UserServiceImp.class);
	
	public UserServiceImp() {};
	
	public static UserService getInstance() {
		return userServiceImp;
	}
	
	@Override
	public boolean registerUser(String firstName, String lastName, String username, String password) {
			log.info("register user");
		return UserDaoImp.getInstance().insertEmployee(firstName, lastName, username, password);
	}
	
	@Override
	public boolean registerManager(String firstName, String lastName, String username, String password) {
		log.info("register manager");
		return UserDaoImp.getInstance().insertManager(firstName, lastName, username, password);
	}

	@Override
	public List<User> viewUser(String username) {
		log.info("view user");
		return UserDaoImp.getInstance().viewUser(username);
	}
	
	@Override
	public boolean userLogin(String username, String password) {
		log.info("user login");
		List<User> loggedUser = UserDaoImp.getInstance().viewUser(username);
		
		try {
		
		if((loggedUser.get(0).getUsername().equals(username)) && (loggedUser.get(0).getPassword().equals(password))) {
			
			log.info("login successful");
			return true;	
		} 
			

		} catch(IndexOutOfBoundsException e) {
			log.info("login unsuccessful");
			log.error(e);
			
		}
		return false;
		
		
	}

	@Override
	public boolean managerLogin(String username, String password) {
		log.info("manager login");
		List<User> loggedUser = UserDaoImp.getInstance().viewUser(username);
		
		try {
		
		if((loggedUser.get(0).getUsername().equals(username)) && (loggedUser.get(0).getPassword().equals(password))
					&& (loggedUser.get(0).getManager().equals(true))) {
			
		
			
			log.info("login successful");
			return true;	
		}
		
		} catch (IndexOutOfBoundsException e) {
			log.info("login unsuccessful");
			log.error(e);
		}
		return false;
	}

}
