package com.project;

public class CalculateProperty {
	
 AddProperty a=new AddProperty();
 DisplayProperty d=new DisplayProperty();
 
 
int propertyTax;
 
public  void calculate()
{
	if(a.getIsCity()=='Y')
	{
		propertyTax=  (int) ((a.getBuiltupArea()*a.getAge()*a.getBaseValue())+(0.5*a.getBaseValue()));
//		return propertyTax;
	}
	else if(a.getIsCity()=='N')
	{
		propertyTax=  (int) ((a.getBuiltupArea()*a.getAge()*a.getBaseValue()));
//		return propertyTax;
				
	}

	
	
	
}
}
