package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private String url= "jdbc:mysql://localhost:3306/mphasislearning";
	private String user="root";
	private String password="root@39";
	
	
	public static Connection con=null;
	public Connection getConnection() 
	{
		if(con==null)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		return con;
	}

}
