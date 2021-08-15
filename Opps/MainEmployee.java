package com.yash.oopsconceptdemo1;

public class MainEmployee {
	public static void main(String args[])
	{
	Employee e = new Employee();
	e.setDetails("Ram",23,"Indore");
	e.getDetails();
	System.out.println("The number of employees working in the company: "+e.count);
	}
}
