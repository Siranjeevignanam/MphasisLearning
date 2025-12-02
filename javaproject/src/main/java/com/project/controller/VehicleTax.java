package com.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.Read;
import com.project.DAO.VehicleDAO;
import com.project.model.Vehicle;
import com.project.service.CalculateVehicle;
import com.project.validations.VehicleValidation;

public class VehicleTax {
//	AddProperty a=new AddProperty();
//	CalculateProperty c=new CalculateProperty();
//	DisplayProperty d = new DisplayProperty();
//	PropertyDAO p= new PropertyDAO();

	Vehicle a = new Vehicle();
	CalculateVehicle c = new CalculateVehicle();
VehicleValidation vd=new VehicleValidation();
	VehicleDAO v = new VehicleDAO();

	public void method() throws Exception {
		while (true) {
			System.out.println("\n");
			System.out.println("Enter a number:\n 1-Insert \n 2-Calculate Vehicle tax \n 3-List all Vehicles \n 4-Exit");
			Scanner sc = new Scanner(System.in);

			List<Vehicle> l1 = new ArrayList<>();
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				
				while (true) {
					System.out.println("Enter Register Number");
					String regNo = Read.sc.next();
					if (vd.checkRegNo(regNo)) {
						a.setRegNo(regNo);
						break;
					}

					System.out.println("Vehicle number should be four digits and should not be zero");

				}
					
					System.out.println("Enter Brand");
					a.setBrand(Read.sc.next());
					
					
					while (true) {
						System.out.println("Enter Maximum Velocity");
						int velocity = Read.sc.nextInt();
						if (vd.checkVelocity(velocity)) {
							a.setMaxVelocity(velocity);
							break;
						}

						System.out.println("Maximum velcotiy between 120 to 300");

					}

					
					
					while(true)
					{
						System.out.println("Enter capacity");
						int capacity=Read.sc.nextInt();
						if(vd.checkCapacity(capacity))
						{
							a.setCapacity(capacity);
							break;
						}
						System.out.println("Capacity should be from 2 to 50");
					}

					
					

					System.out.println("Enter Type \n 1-PETROL 2-DIESEL 3-LPG/CNG");
					int type = Read.sc.nextInt();
					if (type == 1)
						a.setType("PETROL");
					else if (type == 2)
						a.setType("DIESEL");
					else
						a.setType("LPG/CNG");
					
					
					while (true) {
						System.out.println("Enter purchase cost");
						int cost = Read.sc.nextInt();
						if (vd.checkPurchaseCost(cost)) {
							a.setCost(cost);
							break;
						}
						System.out.println("Cost must be between 50000 to 1000000");
					}
					

					a.setVehicleTax(0);
					
					v.insertVehicle(a);
					break;
				
				

			case 2:
				System.out.println("Enter the id of respective Register number of the vehicle you want to calculate");
				v.getDetails();
				System.out.println("Enter id to calculate");
				l1 = v.getAllVehicle();
				int index = Read.sc.nextInt();
				a = l1.get(index - 1);
				double res = c.calculate(a);
				a.setVehicleTax(res);
				v.updateVehicle(a);
				System.out.println("Vehicle Tax for " + a.getRegNo() + " was " + a.getVehicleTax());
				break;

			case 3:
				v.printAllVehicle();

			case 4:
				return;
			}
		}
	}

}
