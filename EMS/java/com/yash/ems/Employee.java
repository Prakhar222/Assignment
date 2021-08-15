package com.yash.ems;

//Creation of employee class where we can make constructor for ArrayList
//And all getter and setter methods are declared


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	int id;
	protected String Name;
	double salary;
	String desg;
	protected String Department;
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + ", desg=" + desg + ", Department="
				+ Department+"]";
	}
	//Scanner input = new Scanner(System.in);
	 
	
	
	
	
	public Employee(int id, String name, double salary, String desg, String department) {
		super();
		this.id = id;
		this.Name = name;
		this.salary = salary;
		this.desg = desg;
		this.Department = department;
		
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	/*public String getName() {
		//this.Name;
		return Name;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	
	

	
}
