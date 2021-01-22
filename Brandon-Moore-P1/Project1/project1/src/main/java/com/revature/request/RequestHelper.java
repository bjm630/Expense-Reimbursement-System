package com.revature.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.revature.controller.EmployeeHomeControllerImp;
import com.revature.controller.LoginControllerImp;
import com.revature.controller.TicketControllerImp;
import com.revature.controller.UserControllerImp;

public class RequestHelper {
	
	private static Logger log = LogManager.getLogger(RequestHelper.class);
	
	private RequestHelper() {}
		
		public static void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			
			log.info(request.getRequestURI());
			
			String endpoint = request.getRequestURI();
			
			
			
			switch(endpoint) {
			case "/project1/FrontController/login":
				LoginControllerImp.getInstance().login(request,response);
				break;
			case "/project1/FrontController/managerLogin":
				LoginControllerImp.getInstance().managerLogin(request,response);
				break;
			case "/project1/FrontController/logout":
				LoginControllerImp.getInstance().logout(request, response);
				break;
			case "/project1/FrontController/register":
				UserControllerImp.getInstance().register(request, response);
				break;
			case "/project1/FrontController/getAllUsers":
				UserControllerImp.getInstance().getAllUsers(request);
				break;
			case "/project1/FrontController/insertTicket":
				TicketControllerImp.getInstance().insertTicket(request, response);
				break;
			case "/project1/FrontController/viewAll":
				TicketControllerImp.getInstance().viewAll(request, response);
				break;	
			case "/project1/FrontController/viewAllApproved":
				TicketControllerImp.getInstance().viewAllApproved(request, response);
				break;		
			case "/project1/FrontController/viewAllDenied":
				TicketControllerImp.getInstance().viewAllDenied(request, response);
				break;		
			case "/project1/FrontController/viewAllPending":
				TicketControllerImp.getInstance().viewAllPending(request, response);
				break;		
			case "/project1/FrontController/viewAllUser":
				TicketControllerImp.getInstance().viewAllUser(request, response);
				break;
			case "/project1/FrontController/changeTicketStatus":
				TicketControllerImp.getInstance().changeTicketStatus(request, response);
				break;
			case "/project1/FrontController/Style.css":
				response.sendRedirect("http://localhost:8080/project1/Style.css");
				break;
			case "/project1/FrontController/ajax.js":
				response.sendRedirect("http://localhost:8080/project1/ajax.js");
				break;
			case "/project1/FrontController/resetToLanding":
				EmployeeHomeControllerImp.getInstance().resetToLanding(request, response);
				break;
				
				
			default:
				log.info("method not implemented");
				response.sendRedirect("http://localhost:8080/project1/index.html");
				
			}
		
	}

}
