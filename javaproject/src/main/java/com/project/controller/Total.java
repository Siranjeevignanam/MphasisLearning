package com.project.controller;

import com.project.Tax;
import com.project.DAO.PropertyDAO;
import com.project.DAO.VehicleDAO;

public class Total {

	Tax p = new PropertyDAO();
	Tax v = new VehicleDAO();

	public void totalTax() throws Exception {
//		double res=p.totalTax();
//		System.out.println(res);
		String hyphen = "-";
		double res = p.totalTax();
		int res1 = p.totalRows();
		System.out.println(hyphen.repeat(100));
		System.out.println(
				String.format("%20s", "Particular") + String.format("%30s", "Quantity") + String.format("%30s", "Tax"));
		System.out.println(hyphen.repeat(100));
		double res2 = v.totalTax();
		int res3 = v.totalRows();
		System.out
				.println(String.format("%20s", "Property") + String.format("%30s", res1) + String.format("%30s", res));
		System.out
				.println(String.format("%20s", "Vehicle") + String.format("%30s", res3) + String.format("%30s", res2));
		System.out.println(hyphen.repeat(100));

		System.out.println(String.format("%20s", "Total") + String.format("%60s", res1 + res2));

	}
}
