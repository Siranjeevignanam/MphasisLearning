package com.example.day1;

import java.util.Scanner;

public class Demo5 {

	
		
		public String binaryValue(int a)
		{
	
		StringBuilder s=new StringBuilder();
		
		while(a>0)
		{
			s.append(a%2);
			a=a/2;
		}
			
		return s.reverse().toString();
		}
		
		public String binarytoOctal(int a)
		{
	
		StringBuilder s=new StringBuilder();
		
		while(a>0)
		{
			s.append(a%8);
			a=a/8;
		}
			
		return s.reverse().toString();
		}
		
		
		
//		public int binarytooctal(int a)
//		
//		{
//			Demo5 d=new Demo5(); 
//			String s =d.binaryValue(a);
//			StringBuilder sb=new StringBuilder(a).reverse();
//			int ans=0;
//			for(int i=0;i<sb.length();i++)
//			{
//				
//				for(int j=1;i<=3;j++)
//				{
//					ans+=(Math.pow(2,i))*s.charAt(i);
//				}
//				
//			}
//			
//			return ans;
//		}
	
		
public static void main(String args []) {
			
			Demo5 a=new Demo5();
			String sb=a.binaryValue(27);
			System.out.println(sb);
			
		}

}
