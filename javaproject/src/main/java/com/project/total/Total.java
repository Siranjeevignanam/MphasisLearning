package com.project.total;

import com.project.property.PropertyDAO;
import com.project.vehicle.VehicleDAO;

public class Total {
	
	PropertyDAO p =new PropertyDAO();
	VehicleDAO v=new VehicleDAO();
	

	public void totalTax() throws Exception
	{
//		double res=p.totalTax();
//		System.out.println(res);
		double res=p.totalTax();
		int res1=p.totalRows();
		System.out.println("Quantity: "+res1+" Property Tax: "+res);
		double res2=v.totalTax();
		int res3=v.totalRows();
		System.out.println("Quantity: "+res3+" Vehicle Tax"+res2);
		System.out.println("Total rows "+(res1+res3)+" Total tax"+(res+res2));
	}
}
