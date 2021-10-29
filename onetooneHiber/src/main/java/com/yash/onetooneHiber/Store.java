package com.yash.onetooneHiber;

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    

public class Store {    
	public static void main(String[] args) {    

		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();  
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  

		Transaction t=session.beginTransaction();   

		Employee e1=new Employee();    
		e1.setName("Prakhar Gupta");    
		e1.setEmail("prakhar.gupta@gmail.com");    

		Address address1=new Address();    
		address1.setAddressLine1("VijayNagar");    
		address1.setCity("Jabalpur");    
		address1.setState("MP");    
		address1.setCountry("India");    
		address1.setPincode(487221);    

		e1.setAddress(address1);    
		//address1.setEmployee(e1);    

		session.persist(e1);    
		t.commit();    

		session.close();    
		System.out.println("success");    
	}    
}    
