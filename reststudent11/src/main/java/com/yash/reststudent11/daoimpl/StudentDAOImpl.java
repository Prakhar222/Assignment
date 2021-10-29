package com.yash.reststudent11.daoimpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.yash.reststudent11.dao.*;
import com.yash.reststudent11.model.*;



public class StudentDAOImpl implements StudentDAO {

	Configuration config=new Configuration().configure();
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();  

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Student> studs=session.createQuery("from Student").list();
		return studs;
	}



	@Override
	public List<Student> addStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();




		@SuppressWarnings("unchecked")
		List<Student> studs=session.createQuery("from Student").list();
		session.close();
		return studs;

	}



	@Override
	public List<Student> removeStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction tr = session.beginTransaction();
		session.delete(student);
		@SuppressWarnings("unchecked")
		List<Student> studs=session.createQuery("from Student").list();
		tr.commit();

		return studs;
	}



	@Override
	public List<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction tr = session.beginTransaction();
		session.update(student);
		@SuppressWarnings("unchecked")
		List<Student> studs=session.createQuery("from Student").list();
		tr.commit();

		return studs;
	}



}
