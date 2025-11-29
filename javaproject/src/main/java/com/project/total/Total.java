package com.project.total;

import com.project.property.PropertyDAO;

public class Total {
	
	PropertyDAO p =new PropertyDAO();
	

	public void totalTax() throws Exception
	{
//		double res=p.totalTax();
//		System.out.println(res);
		double res=p.totalTax();
		int res1=p.totalRows();
		System.out.println("Quantity: "+res1+" Property Tax: "+res);
	}
}
