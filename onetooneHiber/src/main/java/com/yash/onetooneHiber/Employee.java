package com.yash.onetooneHiber;
import javax.persistence.*;  
@Entity  
@Table(name="employee")  
public class Employee {    

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  

	private int employeeId;    
	@Column(name="eName",columnDefinition = "VARCHAR(25)")
	private String name; 
	@Column(name="eMail",columnDefinition = "VARCHAR(25)")
	private String email;
	@OneToOne(cascade=CascadeType.ALL)  
	private Address address;  
	public int getEmployeeId() {  
		return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
		this.employeeId = employeeId;  
	}  
	public String getName() {  
		return name;  
	}  
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getEmail() {  
		return email;  
	}  
	public void setEmail(String email) {  
		this.email = email;  
	}  
	public Address getAddress() {  
		return address;  
	}  
	public void setAddress(Address address) {  
		this.address = address;  
	}    

}    