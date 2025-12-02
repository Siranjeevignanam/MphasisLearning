package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.project.DbConnect;
import com.project.Tax;
import com.project.model.Property;

public class PropertyDAO implements Tax {

	String hyphen = "-";

	public void printAllProperty() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from addProperty");
		ResultSet rs = ps.executeQuery();
		List<Property> res = new ArrayList<Property>();

		while (rs.next()) {
			res.add(new Property(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
					rs.getInt(6)));
		}

//	return res;
		System.out.println(hyphen.repeat(130));
		
		System.out.println(String.format("%20s", "Property Id") + String.format("%20s", "Base Value")
				+ String.format("%20s", "Build Up Area") + String.format("%20s", "Age")
				+ String.format("%20s", "Is City?") + String.format("%20s", "Property Tax"));
		
		System.out.println(hyphen.repeat(130));
		for (int i = 0; i < res.size(); i++) {
			System.out.println(
					String.format("%20s", res.get(i).getPropertyId()) + String.format("%20s", res.get(i).getBaseValue())
							+ String.format("%20s", res.get(i).getBuiltupArea())
							+ String.format("%20s", res.get(i).getAge()) + String.format("%20s", res.get(i).getIsCity())
							+ String.format("%20s", res.get(i).getPropertyTax()));
		}

		System.out.println(hyphen.repeat(130));
		

	}

	public List<Property> getAllProperty() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from addProperty");
		ResultSet rs = ps.executeQuery();
		List<Property> res = new ArrayList<Property>();

		while (rs.next()) {
			res.add(new Property(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
					rs.getInt(6)));
		}

		return res;

	}

	public void insertProperty(Property obj) throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement(
				"insert into addProperty(baseValue,buildUpArea,age,isCity,PropertyTax) values(?,?,?,?,?)");
//	ps.setInt(1, obj.getPropertyId());
		ps.setInt(1, obj.getBaseValue());
		ps.setInt(2, obj.getBuiltupArea());
		ps.setInt(3, obj.getAge());
		ps.setString(4, obj.getIsCity());
		ps.setDouble(5, obj.getPropertyTax());
		int res = ps.executeUpdate();
		System.out.println("The property was added");

	}

	public void updateProperty(Property obj) throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("update addProperty set propertyTax=? where propertyId=?");
		ps.setDouble(1, obj.getPropertyTax());
		ps.setInt(2, obj.getPropertyId());
		ps.executeUpdate();
		System.out.println("The property tax for " + obj.getPropertyId() + " was updated.");
	}

	@Override
	public double totalTax() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("select sum(propertyTax) from addProperty");
		double tax = 0;

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			tax = rs.getDouble(1);

		}
		return tax;
	}

	public int totalRows() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("select count(*) from addProperty");
		ResultSet rs = ps.executeQuery();
		int rows = 0;
		while (rs.next()) {
			rows = rs.getInt(1);

		}
		return rows;
	}

}
