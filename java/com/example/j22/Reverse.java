package com.example.j22;

public class Reverse {
	
	public int rev(int k)
	{
		return Integer.parseInt(rev(String.valueOf(k)));
	}
	
	public float rev(float k)
	{
		return Float.parseFloat(rev(String.valueOf(k)));
	}

	public String rev(String k)
	{
		return new StringBuilder(k).reverse().toString();
	}
	
	public long rev(Long rev)
	{
		return Long.parseLong(rev(String.valueOf(rev)));
		
	}
	
	public static void main(String args[])
			{
		
		Reverse r=new Reverse();
		System.out.println(r.rev(156.098f));
			}
}
