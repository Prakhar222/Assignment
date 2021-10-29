package com.dineshonjava.sdnext.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.dineshonjava.sdnext.dao.EmpDao;
import com.dineshonjava.sdnext.domain.Employee;
import com.dineshonjava.sdnext.jdbc.utils.EmployeeMapper;

/**
 * @author Dinesh Rajput
 *
 */
@Component
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmpDao {
//	@Autowired
//	private JdbcTemplate jdbcTemplateObject;
//	
//	/**
//	 * @param jdbcTemplateObject the jdbcTemplateObject to set
//	 */
//	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
//		this.jdbcTemplateObject = jdbcTemplateObject;
//	}

	@Override
	public void create(String name, Integer age, Long salary) {
		String SQL = "INSERT INTO Employee (name, age, salary) VALUES (?, ?, ?)";
		//jdbcTemplateObject.update(SQL, new Object[]{name, age, salary} );
	    System.out.println("Created Record Name = " + name + " Age = " + age+ " Salary = " + salary);
	}

	@Override
	public Employee getEmployee(Integer empid) {
		String SQL = "SELECT * FROM Employee WHERE empid = ?";
		Employee employee = (Employee) getJdbcTemplate().queryForObject(SQL, new Object[]{empid}, new EmployeeMapper());
	    return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		//String SQL = "SELECT * FROM Employee";
		//List<Employee> employees = (List<Employee>) jdbcTemplateObject.query(SQL, new EmployeeMapper());
	    return null;
	}

	@Override
	public void delete(Integer empid) {
		String SQL = "DELETE FROM Employee WHERE empid = ?";
		//jdbcTemplateObject.update(SQL, new Object[]{empid});
		System.out.println("Deleted Record with EMPID = " + empid );
	}

	@Override
	public void update(Integer empid, Integer age) {
		 String SQL = "UPDATE Employee SET age = ? WHERE empid = ?";
		// jdbcTemplateObject.update(SQL, new Object[]{age, empid});
		 System.out.println("Updated Record with EMPID = " + empid );
	}
}
