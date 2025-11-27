package com.project.property;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.project.DbConnect;

public class PropertyDAO {
	
	
	private ResultSet performQuery(String query)
	{
		return null;
	}
	
	public List<AddProperty> getAllProperty() throws Exception
	{
		Connection c=DbConnect.getConnection();
		PreparedStatement ps= c.prepareStatement("Select * from addProperty");
	ResultSet rs=ps.executeQuery();
	List<AddProperty> res=new ArrayList<AddProperty>();

	while(rs.next())
{
		res.add(new AddProperty(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));
	}
	
	return res;
	}
	

public void insertProperty(AddProperty obj) throws Exception
{
	Connection c=DbConnect.getConnection();
	PreparedStatement ps= c.prepareStatement("insert into addProperty(baseValue,buildUpArea,age,isCity,PropertyTax) values(?,?,?,?,?)");
//	ps.setInt(1, obj.getPropertyId());
	ps.setInt(1, obj.getBaseValue());
	ps.setInt(2, obj.getBuiltupArea());
	ps.setInt(3, obj.getAge());
	ps.setString(4, obj.getIsCity());
	ps.setDouble(5, obj.getPropertyTax());
	int res=ps.executeUpdate();
	System.out.println(obj.getPropertyId()+" was added");
	
}

public void updateProperty(AddProperty obj) throws Exception {
	Connection c=DbConnect.getConnection();
	PreparedStatement ps= c.prepareStatement("update addProperty set propertyTax=? where propertyId=?");
	ps.setDouble(1, obj.getPropertyTax());
	ps.setInt(2, obj.getPropertyId());
	ps.executeUpdate();
	System.out.println("The property tax for "+obj.getPropertyId()+" was updated.");
}

public double totalTax() throws Exception
{
	Connection c=DbConnect.getConnection();
	PreparedStatement ps= c.prepareStatement("select sum(propertyTax) from addProperty");
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
