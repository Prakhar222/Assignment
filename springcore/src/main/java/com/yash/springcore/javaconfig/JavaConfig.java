package com.yash.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.yash.springcore.javaconfig")
public class JavaConfig {
	
	@Bean("firststudent")
	public Student getStudent()
	{
		//create new student obj
	Student student=new Student();
	return student;
	}

}
