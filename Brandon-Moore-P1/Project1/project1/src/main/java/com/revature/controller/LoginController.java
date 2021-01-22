package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface LoginController {
	
	public void login(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ServletException;
	
	public void logout(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ServletException;

	public void managerLogin(HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ServletException;
}
