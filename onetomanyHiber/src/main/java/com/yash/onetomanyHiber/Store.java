package com.yash.onetomanyHiber;

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
		/*Collage collage1=new Collage();
		collage1.setCollageName("JEC");

			Student s1=new Student();
			s1.setStudentName("Ram");
			
			Student s2=new Student();
			s2.setStudentName("Krishna");
			
			s1.setCollage(collage1);
			s2.setCollage(collage1);
			
			
				session.save(collage1);
				session.save(s1);
				session.save(s2);*/
				t.commit();
		       Collage c1=(Collage)session.get(Collage.class, 1);
		        System.out.println(c1.getCollageId());
		        System.out.println(c1.getCollageName());
		        
		        for (Student s: c1.getStudents()) {
		        	System.out.println(s.getStudentName());
			
				}
				
		      
				System.out.println("sucess");
				session.close();
				session=factory.openSession();
				session.beginTransaction();
				
	}
}

