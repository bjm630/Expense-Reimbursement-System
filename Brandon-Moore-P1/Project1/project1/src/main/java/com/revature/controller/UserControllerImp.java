package com.revature.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.revature.service.UserServiceImp;
import com.revature.models.User;


public class UserControllerImp implements UserController {
	
		private static Logger log = LogManager.getLogger(UserControllerImp.class);

		private static UserController userControllerImp = new UserControllerImp();
		
		private UserControllerImp() {}
		
		public static UserController getInstance() {
			return userControllerImp;
		}
	@Override
	public void register(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
			log.info("register");
		
		if (request.getMethod().equals("POST")) {
			
			log.info("post confirmed");
			
			response.setContentType("text/html");
			
			User user = new User(0, request.getParameter("firstName"), request.getParameter("lastName"),
				request.getParameter("username"), request.getParameter("password"), false);
		
			if (UserServiceImp.getInstance().registerUser(user.getFirstName(), user.getLastName(),
				user.getUsername(), user.getPassword())) {
				
				log.info("registration successful");
			
			RequestDispatcher reDis = request.getRequestDispatcher("/index.html");
			
			reDis.forward(request, response);
			
			
			
		}
		
		else {
			
			log.info("registration unsuccessful");
			
			RequestDispatcher reDis = request.getRequestDispatcher("/index.html");
			
			reDis.forward(request, response);
			
			
		}
		}
		
	}

	@Override
	public Object getAllUsers(HttpServletRequest request) {
		
		User loggedUser = (User) request.getSession().getAttribute("loggedUser");
			
		
			if(loggedUser == null) {
				return "login.html";
			}
			
		return null;
	}

}
