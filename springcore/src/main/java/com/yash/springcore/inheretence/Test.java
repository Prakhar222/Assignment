package com.yash.springcore.inheretence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/yash/springcore/inheretence/inconfig.xml");
		Employee emp=(Employee) appContext.getBean("employeeBean");
		System.out.println("Employee name:"+emp.getName());
		System.out.println("Employee number:"+emp.getEmployeeNumber());
	}
}
