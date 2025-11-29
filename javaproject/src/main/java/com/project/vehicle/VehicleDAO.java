package com.project.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.DbConnect;
import com.project.property.AddProperty;

public class VehicleDAO {

	public void insertVehicle(AddVehicle obj) throws Exception
	{
		Connection c=DbConnect.getConnection();
		PreparedStatement ps= c.prepareStatement("insert into addVehicle values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, obj.getVehicleId());
		ps.setInt(2, obj.getRegNo());
		ps.setString(3, obj.getBrand());
		ps.setInt(4, obj.getMaxVelocity());
		ps.setInt(5, obj.getCapacity());
		ps.setString(6, obj.getType());
		ps.setInt(7, obj.getCost());
		ps.setDouble(8, obj.getVehicleTax());
		
		
		ps.executeUpdate();
		System.out.println(obj.getRegNo()+" was added");
	}
	
	
	public void updateProperty(AddVehicle obj) throws Exception {
		Connection c=DbConnect.getConnection();
		PreparedStatement ps= c.prepareStatement("update addVehicle set vehicleTax=? where regNo=?");
		ps.setDouble(1, obj.getVehicleTax());
		ps.setInt(2, obj.getRegNo());
		ps.executeUpdate();
		System.out.println("The property tax for "+obj.getRegNo()+" was updated.");
	}

	
	
	public List<AddVehicle> getAllVehicle() throws Exception
	{
		Connection c=DbConnect.getConnection();
		PreparedStatement ps= c.prepareStatement("Select * from addVehicle");
	ResultSet rs=ps.executeQuery();
	List<AddVehicle> res=new ArrayList<>();

	while(rs.next())
{
		res.add(new AddVehicle(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getDouble(8)));
	}
	
	return res;
	}
	
	public double totalTax() throws Exception
	{
		Connection c=DbConnect.getConnection();
		PreparedStatement ps= c.prepareStatement("select sum(vehicleTax) from addVehicle");
		double tax=0;
		
		ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		tax=rs.getDouble(1);
		
	}
	return tax;
	}

	public int totalRows() throws Exception 
	{
		Connection c=DbConnect.getConnection();
		PreparedStatement ps=c.prepareStatement("select count(*) from addProperty");
		ResultSet rs=ps.executeQuery();
		int rows=0;
		while(rs.next()) {
			rows=rs.getInt(1);
			
		}
		return rows;
	}

}
