package com.yash.oopsconceptdemo1;

public class MainStudent {
	public static void main(String args[])
	{
Student s=new Student();
s.setDetails(2,"Ram",10);
s.setDetails(3,"Sham",10);
s.setDetails(4,"Krishna",10);
s.getDetails();
System.out.println("The number of students registered in the hostel:"+s.count);
	}
}
