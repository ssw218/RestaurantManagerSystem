package com.rmsystem.util;

public class DatabaseHelpers {
	
	public static final String USER = "root";
	
	public static final String PASSWORD = "123456";
	
	public static final String URL = "jdbc:mysql://localhost/test?user=" + USER + "&password=" + PASSWORD;
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private DatabaseHelpers() {
		
	}
	
}
