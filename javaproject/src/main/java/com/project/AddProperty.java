package com.project;

import java.util.ArrayList;
import java.util.List;

public class AddProperty {
	private int propertyId;
	private int baseValue;
	private int builtupArea;
	private int age;
	private char isCity;
	
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
	public char getIsCity() {
		return isCity;
	}
	public void setIsCity(char isCity) {
		this.isCity = isCity;
	}
	@Override
	public String toString() {
		return "AddProperty [propertyId=" + propertyId + ", baseValue=" + baseValue + ", builtupArea=" + builtupArea
				+ ", age=" + age + ", isCity=" + isCity + "]";
	}
	public AddProperty(int propertyId, int baseValue, int builtupArea, int age, char isCity) {
		super();
		this.propertyId = propertyId;
		this.baseValue = baseValue;
		this.builtupArea = builtupArea;
		this.age = age;
		this.isCity = isCity;
	}
	
	public AddProperty()
	{
		
	}
	
	List<AddProperty> list=new ArrayList<>();
	public void setPropertyDetails(AddProperty a)
	{
		list.add(a);
		System.out.println("Data was added");
	}
	

}
