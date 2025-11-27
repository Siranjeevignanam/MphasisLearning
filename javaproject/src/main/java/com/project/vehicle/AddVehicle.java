package com.project.vehicle;

public class AddVehicle {
	private int vehicleId;
	private String regNo;
	private String brand;
	private int maxVelocity;
	private int capacity;
	private String vehicleType;
	private int cost;
	private double vehicleTax;
	
	
public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
public AddVehicle(int vehicleId, String regNo, String brand, int maxVelocity, int capacity, String vehicleType,
			int cost, double vehicleTax) {
		super();
		this.vehicleId = vehicleId;
		this.regNo = regNo;
		this.brand = brand;
		this.maxVelocity = maxVelocity;
		this.capacity = capacity;
		this.vehicleType = vehicleType;
		this.cost = cost;
		this.vehicleTax = vehicleTax;
	}

public AddVehicle()
{
	
}
public String getRegNo() {
	return regNo;
}
public void setRegNo(String regNo) {
	this.regNo = regNo;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getMaxVelocity() {
	return maxVelocity;
}
public void setMaxVelocity(int maxVelocity) {
	this.maxVelocity = maxVelocity;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String getType() {
	return vehicleType;
}
public void setType(String type) {
	this.vehicleType = type;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public double getVehicleTax() {
	return vehicleTax;
}
public void setVehicleTax(double vehicleTax) {
	this.vehicleTax = vehicleTax;
}
@Override
public String toString() {
	return "AddVehicle [vehicleId=" + vehicleId + ", regNo=" + regNo + ", brand=" + brand + ", maxVelocity="
			+ maxVelocity + ", capacity=" + capacity + ", vehicleType=" + vehicleType + ", cost=" + cost
			+ ", vehicleTax=" + vehicleTax + "]";
}


}
