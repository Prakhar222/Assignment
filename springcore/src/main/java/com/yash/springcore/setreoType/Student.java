package com.yash.springcore.setreoType;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("student1")
@Scope("prototype")
public class Student {
@Value("Prakhar")
private String studentName;
@Value("Jabalpur")
private String city;

@Value("#{temp}")
private List<String> address;



public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}




public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}




}
