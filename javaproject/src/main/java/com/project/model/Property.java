package com.project.model;

import java.util.ArrayList;
import java.util.List;

public class Property {
	private int propertyId;
	private int baseValue;
	private int builtupArea;
	private int age;
	private String isCity;
	private double propertyTax;
	
	public double getPropertyTax() {
		return propertyTax;
	}
	public void setPropertyTax(double propertyTax) {
		this.propertyTax = propertyTax;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
			
		
	}
	
	public int getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}
	public int getBuiltupArea() {
		return builtupArea;
	}
	public void setBuiltupArea(int builtupArea) {
		this.builtupArea = builtupArea;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIsCity() {
		return isCity;
	}
	public void setIsCity(String isCity) {
		this.isCity = isCity;
	}
	@Override
	public String toString() {
		return "AddProperty [propertyId=" + propertyId + ", baseValue=" + baseValue + ", builtupArea=" + builtupArea
				+ ", age=" + age + ", isCity=" + isCity + "]";
	}
	public Property(int propertyId, int baseValue, int builtupArea, int age, String isCity,double propertyTax) {
		super();
		this.propertyId = propertyId;
		this.baseValue = baseValue;
		this.builtupArea = builtupArea;
		this.age = age;
		this.isCity = isCity;
		this.propertyTax=propertyTax;
	}
	
	public Property()
	{
		
	}
	
	List<Property> list=new ArrayList<>();
	public void setPropertyDetails(Property a)
	{
		list.add(a);
		System.out.println("Data was added");
	}
	

}
