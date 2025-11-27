package com.project.property;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.Read;

public class PropertyTax
{
	
	AddProperty a=new AddProperty();
	CalculateProperty c=new CalculateProperty();
	DisplayProperty d = new DisplayProperty();
	PropertyDAO p= new PropertyDAO();
	
	public void method() throws Exception
	{
		while(true)
		{
			
			System.out.println("Enter a number:\n 1-Insert \n 2-Calculate property tax \n 3-List all properties \n 4-Exit");
			Scanner sc=new Scanner(System.in);
	
			List<AddProperty> l1=new ArrayList<>();
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
				
				System.out.println("Enter base value");
				a.setBaseValue(sc.nextInt());
				System.out.println("Enter built up area");
				a.setBuiltupArea(sc.nextInt());
				System.out.println("Enter age");
				a.setAge(sc.nextInt());
				System.out.println("Is this a city");
				a.setIsCity(sc.next());
				a.setPropertyTax(0);
			    p.insertProperty(a);break;
			    
			case 2:
				System.out.println("Enter id to calculate");
				l1=p.getAllProperty();
				int index=Read.sc.nextInt();
				a=l1.get(index-1);
				int res=c.calculate(a);
				a.setPropertyTax(res);
				p.updateProperty(a);
				System.out.println("Property Tax is "+res);break;
				
			case 3:
				l1=p.getAllProperty();
				l1.forEach(System.out::println);break;
			case 4:
				return;
				
			default: System.out.println("Invalid choice");
			
			}
		}
	}
	
	
	
}

