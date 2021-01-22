package com.revature.DAO;

import java.util.List;

import com.revature.models.User;

public interface UserDao {

	//CRUD functions for database
	
	//Create
	
	boolean insertEmployee (String firstName, String lastName, String username, String password );
	
	boolean insertManager (String firstName, String lastName, String username, String password );
	
	//Read
	
	List<User> viewUser(String username);
	
}
