package com.yash.springcore.setreoType;

import java.lang.module.Configuration;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {


		ApplicationContext con=new ClassPathXmlApplicationContext("com/yash/springcore/setreoType/stconfig.xml");
		Student student=con.getBean("student1",Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		Student student1=con.getBean("student1",Student.class);
		System.out.println(student1.hashCode());
	
	}
}