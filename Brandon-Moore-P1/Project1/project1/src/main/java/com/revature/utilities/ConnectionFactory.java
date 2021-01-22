package com.revature.utilities;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.sql.Connection;


public final class ConnectionFactory {
	
	private static Logger log = LogManager.getLogger(ConnectionFactory.class);

	
	private static final String URL = ;
	private static final String USERNAME = ;
	private static final String PASSWORD = ;
	
	private static Connection conn;

	public static Connection getConnection() {
		
		log.info("getting connection");
		
		try {
				Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			log.error(e);
		}
		
		try {
			 {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
			
		} catch (SQLException e) {
			log.error(e);
		}
		return conn;

		
	}
	
}
