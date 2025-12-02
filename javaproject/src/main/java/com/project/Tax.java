package com.project;

import java.util.List;

import com.project.model.Vehicle;

public interface Tax {

	public double totalTax() throws Exception;
	public int totalRows() throws Exception;
}
