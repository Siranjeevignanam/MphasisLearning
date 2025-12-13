package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

import project.model.Admin;
import project.model.User;
import project.util.DbConnect;

public class UserDao {
	
	
	public void addUser(String name,String password)
	{
		try(Connection c=DbConnect.getConnection())
		{
			PreparedStatement ps=c.prepareStatement("insert into user(name,password) values (?,?)");
			ps.setString(1,name);
			ps.setString(2, password);
			ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	public User validate(User user) {
	   User validUser = null;
	    try (Connection c = DbConnect.getConnection()) {
	        PreparedStatement ps = c.prepareStatement("SELECT * FROM admin WHERE name=?");
	        ps.setString(1, user.getName());
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            String realPass = rs.getString("password");
	            if (user.getPassword().equals(realPass)) {
	                validUser = new User();
	                validUser.setId(rs.getInt("id"));
	                validUser.setName(rs.getString("name"));
	                validUser.setPassword(realPass);
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return validUser; // ✅ null if invalid
	}


}
