package com.yash.newconcepts.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class c = Class.forName("com.yash.newconcepts.reflection.Employee");
		System.out.println(c);
		System.out.println("Super Class : "+c.getSuperclass());
		int mod=c.getModifiers();
		System.out.println("mod : "+mod);
		System.out.println("Access Specifier : "+Modifier.toString(mod));
		
		Class[] classes = c.getInterfaces();
		for(Class cls : classes) {
			System.out.println(cls+" hascode "+cls.hashCode());
	
		
		}
		/*Field[] fields = c.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field+" hascode "+field.hashCode());
		}
		Constructor[] constructors = c.getConstructors();
		System.out.println(constructors.length);
		for(Constructor constructor : constructors)
		{
			System.out.println(constructor+" hashcode "+constructor.hashCode());
		}*/
		Constructor[] constructors = c.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		Employee employee=(Employee)constructors[0].newInstance();
		System.out.println(employee);
		
		
	}
	
	
	
	
}
