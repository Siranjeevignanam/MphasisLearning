package com.project.property;

public class CalculateProperty {
	
// AddProperty a=new AddProperty();
 DisplayProperty d=new DisplayProperty();
 
 
int propertyTax;
 
public  int calculate(AddProperty a)
{
	if(a.getIsCity().equals("Y") || a.getIsCity().equals("y"))
	{
		propertyTax=  (int) ((a.getBuiltupArea()*a.getAge()*a.getBaseValue())+(0.5*a.getBaseValue()));
		return propertyTax;
	}
	else if(a.getIsCity().equals("N") || a.getIsCity().equals("n"))
	{
		propertyTax=  (int) ((a.getBuiltupArea()*a.getAge()*a.getBaseValue()));
		return propertyTax;
				
	}
	else
	{
		return 0;
	}
	
	
	
}
}
