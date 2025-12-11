package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project.model.Admin;
import project.util.DbConnect;



public class AdminDao {
	Admin a=new Admin();
	public Admin validate(Admin a)
	{
		try ( Connection c=DbConnect.getConnection() ) 	
		{
			PreparedStatement ps=c.prepareStatement("select * from admin where name=?");
			
			ps.setString(1, a.getName());
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				String realPass=rs.getString("password");
				if(a.getPassword().equals(realPass))
				{
					a.setId(rs.getInt("id"));
					a.setName(a.getName());
					a.setPassword(a.getPassword());
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}

}
