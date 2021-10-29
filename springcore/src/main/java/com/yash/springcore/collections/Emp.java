package com.yash.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private List<String> phone;
	private Set<String> addresses;
	private Map<String,String> courses;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(List<String> phone, Set<String> addresses, Map<String, String> courses, String name) {
		super();
		this.phone = phone;
		this.addresses = addresses;
		this.courses = courses;
		this.name = name;
	}
	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [phone=" + phone + ", addresses=" + addresses + ", courses=" + courses + ", name=" + name + "]";
	}
	
	
	

}
