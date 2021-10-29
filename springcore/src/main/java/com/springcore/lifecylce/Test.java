package com.springcore.lifecylce;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/lifecylce/lfconfig.xml");
		//		Food f=(Food) con.getBean("f1");
		//		System.out.println(f);
		//		//registring shutdown hook
		con.registerShutdownHook();
		//		
		//		System.out.println("------------------------------------------------");
		//		ColdDrink c=(ColdDrink) con.getBean("c1");
		//		System.out.println(c);


		Example e1=(Example)con.getBean("e1");
		System.out.println(e1);
	}


}
