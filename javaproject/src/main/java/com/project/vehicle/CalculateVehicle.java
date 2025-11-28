package com.project.vehicle;

public class CalculateVehicle {

	double vehicleTax;
	
	public double calculate(AddVehicle a)
	{
		if(a.getType().equals("PETROL"))
		{
			vehicleTax=(a.getMaxVelocity()+a.getCapacity()+(0.1*a.getCost()));
			return vehicleTax;
		}
		else if(a.getType().equals("DIESEL"))
		{
			vehicleTax=(a.getMaxVelocity()+a.getCapacity()+(0.11*a.getCost()));
			return vehicleTax;
		}
		else
		{
			vehicleTax=(a.getMaxVelocity()+a.getCapacity()+(0.12*a.getCost()));
			return vehicleTax;
		}
	}
}
