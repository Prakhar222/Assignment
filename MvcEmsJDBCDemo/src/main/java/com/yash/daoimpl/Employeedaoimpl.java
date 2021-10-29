package com.yash.daoimpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.dao.Employeedeo;
import com.yash.modal.Employee;

public class Employeedaoimpl implements Employeedeo {

	private JdbcTemplate jdbcTemplate;

	public Employeedaoimpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int InsertEmployeeData(Employee employee) {

		String sql="insert into employeedata(id,name,salary,department,designation,address) values(?,?,?,?,?,?)";
		try {

			int counter = jdbcTemplate.update(sql,new Object[] { employee.getId(),employee.getName(),employee.getSalary(),employee.getDepartment(),employee.getDesignation(),employee.getAddress() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

//	@Override
//	public int update(Employee employee) {
//		String sql="update into employeedata id=?,name=?,salary=?,department=?,designation=?,address=? ";
//		try {
//
//			int counter = jdbcTemplate.update(sql,
//					new Object[] { employee.getId(),employee.getName(),employee.getSalary(),employee.getDepartment(),employee.getDesignation(),employee.getAddress() });
//
//			return counter;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		}
//	}

//	@Override
//	public List<Employee> read() {
//		List<Employee> employeeList = jdbcTemplate.query("SELECT * FROM employeedata", new RowMapper<Employee>() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee employee = new Employee();
//
//				employee.setId(rs.getInt("id"));
//				employee.setName(rs.getString("name"));
//				employee.setSalary(rs.getDouble("salary"));
//				employee.setAddress(rs.getString("address"));
//				employee.setDepartment(rs.getString("department"));
//				employee.setDesiganation(rs.getString("designation"));
//
//				return employee;
//			}
//
//		});
//
//		return employeeList;
//	}

//	@Override
//	public List<Employee> findStudentById(int employeeId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int delete(int employeeId) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//				
	
	
}
