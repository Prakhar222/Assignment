package com.yash.ems.serviceimpl;
import java.util.List;



import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
import com.yash.ems.util.HibernateUtil;



@Repository
public class EmployeeServiceImpl implements EmployeeService {
	Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDao employeedeo;

	private EmployeeServiceImpl() {


		employeedeo=new EmployeeDaoImpl();



	}

	@Autowired
	private HibernateUtil hiber;



	@Override
	public Employee getEmployeeById(int empid) {
		Session session = hiber.getSession();
		Transaction t = session.beginTransaction();        
		Employee employee = (Employee) session.load(Employee.class, new Integer(empid));
		logger.info("Person loaded successfully, Person details="+employee);
		return employee;

	}



	@Override
	public Employee getEmployeeByName(String empname) {
		Session session = hiber.getSession();
		Transaction t = session.beginTransaction();
		String hql = "FROM Employee E WHERE E.name = :ename";
        Query query = session.createQuery(hql);
        query.setParameter("ename", empname);
        List<Employee> list = query.list();
        Employee e = list.get(0);
        t.commit();
        return e;
	}



	@Override
	public boolean save(Employee employee) {

		return employeedeo.save(employee);
	}



	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeedeo.findAll();
	}



	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return employeedeo.update(employee);
	}



	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return employeedeo.delete(id);
	}



}