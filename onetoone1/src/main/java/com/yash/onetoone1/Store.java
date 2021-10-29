package com.yash.onetoone1;

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
		Person p1 = new Person();

		p1.setName("Tom");

		Department d = new Department();
		d.setName("Design");
		p1.setDepartment(d);
		d.setPerson(p1);
		session.save(d);
		session.save(p1);
		t.commit();
		System.out.println("sucess");
		session.close();
		session=factory.openSession();
		session.beginTransaction();
		/* em.persist(p1);
    em.persist(d);

    Query query = em.createQuery("SELECT e FROM Person e");
    List<Person> list = (List<Person>) query.getResultList();
    System.out.println(list.get(0).getDepartment());

  }
  @PersistenceContext
  private EntityManager em;*/
}
}

