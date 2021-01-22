package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class EmployeeHomeControllerImp implements EmployeeHomeController {
	
	private static Logger log = LogManager.getLogger(EmployeeHomeControllerImp.class);
	
	private static EmployeeHomeController employeeHomeControllerImp = new EmployeeHomeControllerImp();
	
	private EmployeeHomeControllerImp() {};
	
	public static EmployeeHomeController getInstance() {
	return employeeHomeControllerImp;
	}

	@Override
	public void employeeHome(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			log.info("employee home");
		
		try {
		
			if((request.getSession(false) != null) && (((Integer)request.getSession().getAttribute("userID")) > 0)) {
				
				log.info("logging in");
				
				response.sendRedirect("http://localhost:8080/project1/employeeHome.html");
				
			}else{
				
				response.sendRedirect("http://localhost:8080/project1/index.html");
				log.info("did not login");
			}}catch(NullPointerException e) {
				
			
				response.sendRedirect("http://localhost:8080/project1/index.html");
				log.error(e);
				
			}

	}

	@Override
	public void resetToLanding(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			response.sendRedirect("http://localhost:8080/project1/index.html");
			log.info("resetToLanding");

	}

	@Override
	public void managerHome(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			log.info("manager home");
		
			if((request.getSession(false) != null) && ((Boolean)request.getSession().getAttribute("manager"))) {
				
				log.info("logging in");
			
			response.sendRedirect("http://localhost:8080/project1/managerHome.html");
			
		}else {
			response.sendRedirect("http://localhost:8080/project1/index.html");
			
				log.info("did not log in");
		}

}
		
	}


