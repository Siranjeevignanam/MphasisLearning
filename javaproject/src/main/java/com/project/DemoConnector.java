//package com.project;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.util.List;
//
//import com.example.day1.Read;
//
//public class DemoConnector {
//	
//	public static void main(String[] args) {
//		try {
//			Connection c= DbConnect.getConnection();
//		System.out.println("Connection successful");
//			
//			AddProperty a=new AddProperty();
//			
//			int ch=0;
//			System.out.println("Enter 0 for exit and 1 for display");
//			do
//			{
//				
//				ch=Read.sc.nextInt();
//				switch(ch)
//				{
//				case 0:
//					System.out.println("Thank you for using the service");
//					s1=null;
//					break;
//				case 1:
//					List<StudentDTO> l1=s1.getAllStudents();
//					l1.forEach(System.out::println);break;
//					
//				case 2:
//					StudentDTO ob=new StudentDTO();
//					StudentDAO dao=new StudentDAO();
//					System.out.println("Enter id to search.");
//					ob.setRoll(Read.sc.nextInt());
//					StudentDTO res= dao.getById(ob);
//					System.out.println(res);break;
//					
//				case 3:
//					StudentDTO ob1=new StudentDTO();
//					StudentDAO dao1=new StudentDAO();
//					System.out.println("Enter id to search.");
//					ob1.setRoll(Read.sc.nextInt());
//					dao1.deleteById(ob1);
//					System.out.println("Student deleted");break;
//					
//				case 4:
//					StudentDAO dao2=new StudentDAO();
//					
//					StudentDTO obj2=new StudentDTO();
//					obj2.setDob(new Date(27, 01, 2004));
//					obj2.setFirstname("Siranjeevi");
//					obj2.setLname("Gnanaprakasam");
//					obj2.setRoll(51);
//					obj2.setGender("M");
//					dao2.insertStudent(obj2);break;
//			
//					default : System.out.println("Please enter correct input");
//				}
//			}
//			while(ch!=0);
//		} 
//		
//		catch (Exception e) {
//		System.out.println("Connection failed : "+e.getMessage());
//		}
//	}
//
//}
