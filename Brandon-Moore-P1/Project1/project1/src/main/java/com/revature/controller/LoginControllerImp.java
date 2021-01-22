package com.revature.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.revature.DAO.UserDaoImp;
import com.revature.models.User;
import com.revature.service.UserServiceImp;


public class LoginControllerImp implements LoginController {

	private static Logger log = LogManager.getLogger(LoginControllerImp.class);
	
	private static LoginController loginControllerImp = new LoginControllerImp();
	
	private LoginControllerImp() {};
	
	public static LoginController getInstance() {
	return loginControllerImp;
	}
	
	@Override
	public void login(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ServletException { 
			
		log.info("login");
		
		if(request.getMethod().equals("POST")) {
			
			log.info("post method confirmed");		
			
			response.setContentType("text/html");
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
				
			if(UserServiceImp.getInstance().userLogin(username, password) == true) {
				
				log.info("login successful");
				
				List<User> loggedUser = UserDaoImp.getInstance().viewUser(username);
		
				Integer userID = loggedUser.get(0).getUserID();
				
				HttpSession session = request.getSession();
				session.setAttribute("userID", userID);
				
				log.info("creating session");
				
				RequestDispatcher reDis = request.getRequestDispatcher("/employeeHome.html");
				
				reDis.forward(request, response);
				
			} else { 
				
				log.info("invalid credentials"); 
				response.setStatus(403);
				RequestDispatcher reDis = request.getRequestDispatcher("/index.html");
				
				reDis.forward(request, response);
			}
			
			log.info(UserServiceImp.getInstance().userLogin(username, password));
			
			}	
	
	}
			

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ServletException{
		
		log.info("logout");
		
		if(request.getMethod().equals("GET")) {
			
			log.info("confirmed get");
		
		request.getSession().invalidate();
		
		response.sendRedirect("http://localhost:8080/project1/index.html");
		
			log.info("logout successful");
		} else {
			log.info("method not get");
		}
	}

	@Override
	public void managerLogin(HttpServletRequest request, HttpServletResponse response)
			throws JsonParseException, JsonMappingException, IOException, ServletException {
		
			log.info("manager login");
			
			if(request.getMethod().equals("POST")) {
				
			log.info("confirmed post");
			
			response.setContentType("text/html");
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
				
			UserServiceImp.getInstance().managerLogin(username, password);
			
			if(UserServiceImp.getInstance().managerLogin(username, password) == true) {
				
				log.info("manager login sucessfull");
				
			HttpSession session = request.getSession();
			session.setAttribute("manager", true);
			
			log.info("getting manager session");
				
			RequestDispatcher reDis = request.getRequestDispatcher("/managerHome.html");
			
			reDis.forward(request, response);
				
			} else { 
				log.info("invalid credentials");
				response.setStatus(403);
				RequestDispatcher reDis = request.getRequestDispatcher("/index.html");
				
				reDis.forward(request, response);
				
			}
			
			} else {
				log.info("method not post");
				
			}
		
	}

}
