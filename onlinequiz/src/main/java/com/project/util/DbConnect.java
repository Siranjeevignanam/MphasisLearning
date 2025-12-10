package com.project.util;



import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private static String url= "jdbc:mysql://localhost:3306/mphasislearning";
	private static String user="root";
	private static String password="root@27";
	
	
	public static Connection con=null;
	public static Connection getConnection() 
	{
		if(con==null)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				DriverManager.getConnection(url, user, password);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		return con;
	}

}