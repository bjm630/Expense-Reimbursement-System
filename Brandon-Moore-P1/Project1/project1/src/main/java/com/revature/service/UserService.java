package com.revature.service;

import java.util.List;

import com.revature.models.User;

public interface UserService {
	
	public boolean registerUser(String firstName, String lastName, String username, String password );

	public boolean registerManager(String firstName, String lastName, String username, String password );
	
	public List<User> viewUser(String username);
	
	public boolean userLogin(String username, String password);
	
	public boolean managerLogin(String username, String password);
	
}
