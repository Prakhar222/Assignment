package com.yash.Criteria;

import javax.persistence.*;



import java.util.List;
import javax.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaQueryExample {

	public static void main(String[] args) {


		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();  
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session s=factory.openSession();  

		Transaction t=s.beginTransaction();   

		/*Employee emp=new Employee();
		emp.setId(2);
		emp.setLocation("Jabalpur");
		emp.setFname("Aman");
		emp.setLname("Gupta");
		emp.setPhone("810957223");
		emp.setSalary(55.0);
		
		s.save(emp);
		System.out.println("Done");
		*/
		/*CriteriaBuilder builder = s.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> q=s.createQuery(query);
		List<Employee> employees=q.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee.getFname());
		}
		
		 Criteria c=  s.createCriteria(Employee.class);
         
            List<Employee> students = c.list();
            for(Employee st1:students)
            {
              System.out.println(st1.getFname());    
            }*/
		CriteriaBuilder cb=s.getCriteriaBuilder();  
        CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);  
        Root<Employee> emp=cq.from(Employee.class);  
        cq.orderBy(cb.asc(emp.get("Fname")));  
        CriteriaQuery<Employee> select = cq.select(emp);  
        TypedQuery<Employee> q = s.createQuery(select);  
        List<Employee> list = q.getResultList();  
        for(Employee e:list)  
        {  
           
            System.out.print(e.getFname());  
              
        } 
		
		s.getTransaction().commit();
	
		//t.commit();
		//s.close();
		
	}

}
