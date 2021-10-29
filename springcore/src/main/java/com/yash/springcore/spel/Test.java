package com.yash.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/springcore/spel/spelconfig.xml");
		Demo d1= context.getBean("demo",Demo.class);
		System.out.println(d1);
		
//		SpelExpressionParser s=new	SpelExpressionParser();
//		org.springframework.expression.Expression expression=s.parseExpression("1+2+3+4");
//		System.out.println(expression.getValue());
		
	}

	
}
