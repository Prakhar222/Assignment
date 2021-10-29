package com.yash.modal;

public class Employee {
	/*
	 * id of employee
	 */
	private int id;
	
	/*
	 * name of employee
	 */
	private String name;
	
	/*
	 * salary of employee
	 */
	private double salary;
	
	
	/*
	 * department of employee
	 */
	private String department;
	
	/*
	 * desiganation of employee
	 */
	private String designation;
	
	
	
	/*
	 * address of employee
	 */
	private String address;
	
	public Employee(){
		
	}

	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param designation
	 * @param department
	 * @param address
	 */
	public Employee(int id, String name, double salary, String designation, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the desiganation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param desiganation the designation to set
	 */
	public void setDesiganation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", department=" + department + ", address=" + address + "]";
	}
	
	
	

}
