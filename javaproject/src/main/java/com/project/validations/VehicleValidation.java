package com.project.validations;

public class VehicleValidation {
	public boolean checkRegNo(String regNo)
	{
           if(regNo.equals("0000")||regNo.length()!=4)
		{
			return false;
		}
		
			return true;
		
	}

	public boolean checkPurchaseCost(int cost)
	{
		if(cost>= 50000 && cost<= 1000000)
		{
			return false;
		}
			
		
			return true;
	}
	
	public boolean checkVelocity(int velocity)
	{
		if(velocity>0 && velocity>=120 && velocity<=300)
			
		{
			return true;
		}
		return false;
	}
	
	public boolean checkCapacity(int capacity)
	{
	if(capacity>=2 && capacity<=50)	
		
	{
		return true;
	}
		return false;
}
}