package com.yash.FirstLevel;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    private static Product product;

	public static void main( String[] args )
    {
    	Product a = null;
        
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Product.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		
      /*  Product a1=new Product();
		a1.setPid(102);
		a1.setPname("Pen");
		a1.setColor("Blue");
		s.save(a1);
		System.out.println("Sucess");
		
		product = s.get(Product.class, 102);
		 System.out.println(product);*/
		
        a = (Product) s.get(Product.class, 101);
        System.out.println(a);
        
        
        s.getTransaction().commit();
       // s.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        
        a=(Product) session2.get(Product.class, 101);
        System.out.println(a);
   
       s.getTransaction().commit();
       s.close();
        
		//t.commit();
		//sf.close();
		//s.close();


    }
}