package com.example.day3;

public class Lambda {
	
	public static void main(String args[])
			{
		
	IsMath obj=(x,y)->(x+y);
	IsMath obj1=(x,y)->{
		int z=x-y;
		return z;
	};
	
		System.out.println(obj.cal(10, 20));
		System.out.println(obj1.cal(10, 20));
		
		f1((x,y)->(x/y),10,2);
			}

	public static void f1(IsMath obj,int a,int b)
	{
		obj.cal(a, b);
	}
}

@FunctionalInterface
interface IsMath{
	
	public int cal(int a,int b);
//	public int add(int a,int b);
}