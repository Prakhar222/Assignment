package com.yash.oopsconceptdemo1;

public class Employee {
	String emp_Name;
	int emp_ID;
	String emp_Designation;
	int count=0;	
	public void setDetails(String emp_Name,int emp_ID,String emp_Designation)
	{
		this.emp_Name=emp_Name;
		this.emp_ID=emp_ID;
		this.emp_Designation=emp_Designation;
		count++;
	}
	public void getDetails() {
		System.out.println("Employee Name: "+emp_Name+"\nEmployee ID: "+emp_ID+"\nEmployeeDesignation: "+emp_Designation);
	
	}
}
