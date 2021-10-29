package com.yash.springcore.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	 public static void main(String[] args)
	 {
		 ApplicationContext appContext  = new ClassPathXmlApplicationContext("com/yash/springcore/inter/interconfig.xml");
	        ColorSetter shape = (ColorSetter)appContext.getBean("color1");
	        shape.getColor().displayName();
	 }
	}