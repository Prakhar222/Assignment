package com.yash.ems.service;

import java.util.List;

import com.yash.ems.exception.EmployeeByDepartmentNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.exception.EmployeeBySalaryNotFoundException;
import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.modal.Employee;

public interface EmployeeService 
{
public void getEmployeeById() throws EmployeeIdNotFoundException;
public void getEmployeeByName() throws EmployeeByNameNotFoundException; 
public void getEmployeeByDepartment() throws EmployeeByDepartmentNotFoundException;
public void getEmployeeBySalary() throws EmployeeBySalaryNotFoundException;
public void getAllDepartment();
public void getHighestPaidEmployee();


public static List<Employee>initEmpList(List<Employee> empList)
{
		Employee e1=new Employee(1,"Sanjay",1000.00,"Developer","Pune",786998988,"IT");
		Employee e2=new Employee(2,"Rahul",1000.00,"Testing","Chennai",644576568,"CS");
		Employee e3=new Employee(3,"Manoj",1000.00,"Mechanic","Delhi",75642353,"ME");
		Employee e4=new Employee(4,"Shivam",1000.00,"Electrician","Pune",45635355,"EC");
		Employee e5=new Employee(5,"Navin",1000.00,"Plumber","Pune",786998988,"ME");
		Employee e6=new Employee(6,"Ajay",1000.00,"Design","Pune",786998988,"IT");
		Employee e7=new Employee(7,"Atharv",1000.00,"Maintainance","Pune",786998988,"IT");
		
  empList.add(e1);
  empList.add(e2);
  empList.add(e3);
  empList.add(e4);
  empList.add(e5);
  empList.add(e6);
  empList.add(e7);
  return empList;


}

}