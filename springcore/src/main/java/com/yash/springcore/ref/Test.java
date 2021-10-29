package com.yash.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("refconfig.xml");
		A temp= (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());

		System.out.println(temp);
		System.out.println(temp.hashCode());
		A temp1= (A) context.getBean("aref");
	
		System.out.println(temp1.hashCode());
	}

}
