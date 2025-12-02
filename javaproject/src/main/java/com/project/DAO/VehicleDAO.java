package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.DbConnect;
import com.project.Tax;
import com.project.model.Vehicle;

public class VehicleDAO implements Tax {

	public void insertVehicle(Vehicle obj) throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement(
				"insert into addVehicle(regNo,brand,maxVelocity,capacity,vehicleType,cost,vehicleTax) values(?,?,?,?,?,?,?)");

		ps.setString(1, obj.getRegNo());
		ps.setString(2, obj.getBrand());
		ps.setInt(3, obj.getMaxVelocity());
		ps.setInt(4, obj.getCapacity());
		ps.setString(5, obj.getType());
		ps.setInt(6, obj.getCost());
		ps.setDouble(7, obj.getVehicleTax());

		ps.executeUpdate();
		System.out.println(obj.getRegNo() + " was added");
	}

	public void updateVehicle(Vehicle obj) throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("update addVehicle set vehicleTax=? where regNo=?");
		ps.setDouble(1, obj.getVehicleTax());
		ps.setString(2, obj.getRegNo());
		ps.executeUpdate();
//		System.out.println("The property tax for "+obj.getRegNo()+" was updated.");
	}

	public List<Vehicle> getAllVehicle() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from addVehicle");
		ResultSet rs = ps.executeQuery();
		List<Vehicle> res = new ArrayList<>();

		while (rs.next()) {
			res.add(new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
					rs.getString(6), rs.getInt(7), rs.getDouble(8)));
		}

		return res;
	}

	@Override
	public double totalTax() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("select sum(vehicleTax) from addVehicle");
		double tax = 0;

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			tax = rs.getDouble(1);

		}
		return tax;
	}

	@Override
	public int totalRows() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("select count(*) from addVehicle");
		ResultSet rs = ps.executeQuery();
		int rows = 0;
		while (rs.next()) {
			rows = rs.getInt(1);

		}
		return rows;
	}

	String hyphen = "-";

	public void printAllVehicle() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from addVehicle");
		ResultSet rs = ps.executeQuery();
		List<Vehicle> res = new ArrayList<>();

		while (rs.next()) {
			res.add(new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),

					rs.getString(6),

					rs.getInt(7), rs.getDouble(8)));
		}

		System.out.println(hyphen.repeat(130));
		System.out.println(String.format("%20s", "Vehicle Id") + String.format("%20s", "Register number")
				+ String.format("%20s", "Brand") + String.format("%20s", "Max velocity")
				+ String.format("%20s", "Capacity") + String.format("%20s", "Type")
				+ String.format("%20s", "Property Tax"));
		System.out.println(hyphen.repeat(130));
		for (int i = 0; i < res.size(); i++) {
			System.out.println(String.format("%20s", res.get(i).getVehicleId())
					+ String.format("%20s", res.get(i).getRegNo()) + String.format("%20s", res.get(i).getBrand())
					+ String.format("%20s", res.get(i).getMaxVelocity())
					+ String.format("%20s", res.get(i).getCapacity()) + String.format("%20s", res.get(i).getType())
					+ String.format("%20s", res.get(i).getVehicleTax())

			);
		}
		System.out.println(hyphen.repeat(130));
	}

	public void getDetails() throws Exception {
		Connection c = DbConnect.getConnection();
		PreparedStatement ps = c.prepareStatement("Select vehicleId,regNo from addVehicle");
		ResultSet rs = ps.executeQuery();
		System.out.println(String.format("%10s", "Id") + String.format("%10s", "Reg.No"));

		while (rs.next()) {

			System.out.println(String.format("%10s", rs.getInt(1)) + String.format("%10s", rs.getString(2)));
		}

	}
}
