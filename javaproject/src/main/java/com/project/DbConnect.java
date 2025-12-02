package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	public static Connection c=null;
	public static Connection getConnection() throws Exception
	{
		
		if(c==null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("+");
		}
		return c;
		
	}
}
