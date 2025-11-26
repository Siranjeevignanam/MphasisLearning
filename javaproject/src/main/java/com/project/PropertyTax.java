package com.project;

import java.util.Scanner;

public class PropertyTax
{
	
	AddProperty a=new AddProperty();
	CalculateProperty c=new CalculateProperty();
	DisplayProperty d = new DisplayProperty();
	public void method()
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number from 1 to 4");
			
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter id");
				a.setPropertyId(sc.nextInt());
				System.out.println("Enter base value");
				a.setBaseValue(sc.nextInt());
				System.out.println("Enter built up area");
				a.setBuiltupArea(sc.nextInt());
				System.out.println("Enter age");
				a.setAge(sc.nextInt());
				System.out.println("Is this a city");
				a.setIsCity(sc.nextLine().charAt(0));
			a.setPropertyDetails(a);
			
			
			}
		}
	}
	
	
	
}

