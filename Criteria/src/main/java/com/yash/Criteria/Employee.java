package com.yash.Criteria;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "employee2")
public class Employee 
{
 	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 	
	int id;
    String Fname;
    String Lname;
    String phone;
    String location;
    double salary;
    
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String fname, String lname, String phone, String location, double salary) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.phone = phone;
		this.location = location;
		this.salary = salary;
	}
	
	
	
	
}
