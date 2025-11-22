package com.example.day3;

public class Demo2 {
	
	public static void main(String args []) 
			{
		Temp1<Integer> ob=new Temp1();
		ob.setData(100,200);
		ob.display();
		
		Temp1<String> s1=new Temp1<String>();
		s1.setData("Hi", "hello");
		s1.display();

		Temp2<String,Integer> t1=new Temp2<String,Integer>();
		t1.setData("Hi", 7);
		t1.display();
			}

}

class Temp1<T>
{
	T a,b;
	public void setData(T x,T y)
	{
		a=x;
		b=y;
	}
	
	public void display()
	{
		System.out.println(a+" "+b);
		
	}
}

class Temp2<T1,T2>
{
	T1 a;
	T2 b;
	public void setData(T1 x,T2 y)
	{
		a=x;
		b=y;
	}
	
	public void display()
	{
		System.out.println(a+" "+b);
		
	}
}