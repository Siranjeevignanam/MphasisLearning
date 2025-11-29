package com.project.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.Read;
import com.project.property.AddProperty;

public class VehicleTax {
//	AddProperty a=new AddProperty();
//	CalculateProperty c=new CalculateProperty();
//	DisplayProperty d = new DisplayProperty();
//	PropertyDAO p= new PropertyDAO();
	
	AddVehicle a=new AddVehicle();
	CalculateVehicle c=new CalculateVehicle();
	DisplayVehicle d=new DisplayVehicle();
	VehicleDAO v=new VehicleDAO();
	
	public void method() throws Exception
	{
		while(true)
		{
			System.out.println("\n");
			System.out.println("Enter a number:\n 1-Insert \n 2-Calculate Vehicle tax \n 3-List all Vehicles");
			Scanner sc=new Scanner(System.in);
	
			List<AddVehicle> l1=new ArrayList<>();
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
				
				System.out.println("Enter id:");
				a.setVehicleId(Read.sc.nextInt());
				System.out.println("Enter Register Number");
				a.setRegNo(Read.sc.nextInt());
				
				System.out.println("Enter Brand");
				a.setBrand(Read.sc.next());
				
				System.out.println("Enter Maximum Velocity");
				a.setMaxVelocity(Read.sc.nextInt());
				
				System.out.println("Enter capacity");
				a.setCapacity(Read.sc.nextInt());
				
				System.out.println("Enter Type");
				a.setType(Read.sc.next());
				
				System.out.println("Enter purchase cost");
				a.setCost(Read.sc.nextInt());
				
				a.setVehicleTax(0);
			    v.insertVehicle(a);
			    break;
			    
			case 2:
				System.out.println("Enter id to calculate");
				l1=v.getAllVehicle();
				int index=Read.sc.nextInt();
				a=l1.get(index-1);
				double res=c.calculate(a);
				a.setVehicleTax(res);
				v.updateProperty(a);
				System.out.println("Vehicle Tax is "+res);break;
				
			case 3:
				l1=v.getAllVehicle();
				l1.forEach(System.out::println);break;
				
				
//			case 4:
//				System.out.println("Exited.");break;
//				
//			default: System.out.println("Invalid choice");
			
			}
		}
	}
	
}
