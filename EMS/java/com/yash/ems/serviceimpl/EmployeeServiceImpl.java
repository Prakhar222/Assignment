package com.yash.ems.serviceimpl;
/*
 * 
 * author 
 * Prakhar Gupta
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.yash.ems.Employee;
import com.yash.ems.service.EmployeeService1;
//We can implement interface for accessing the methods
public class EmployeeServiceImpl implements EmployeeService1
	{
	    //private static List<Employee> empList;
           Scanner sc = new Scanner(System.in);
           //Create ArrayList
	        ArrayList<Employee> e=new ArrayList<Employee>();
	        {
	        
	        e.add(new Employee(1,"Govind",20000,"Software Engineer","Testing"));
	        e.add(new Employee(2,"Ram",40000,"Software Engineer","Dev"));
	        e.add(new Employee(3,"Harsh",30000,"Software Engineer","Test"));
	        e.add(new Employee(4,"Jay",45000,"Software Engineer","Test"));
	        e.add(new Employee(5,"Prakhar",50000,"Software Engineer","Dev"));
	       
	        
	        }
	        
	        //Override all methods of interface and give functionality
	    @Override
	    public void getAllEmployee() {
	        e.stream().forEach(emp->System.out.println(emp));
	        
	    }

	 

	    @Override
	    public void getEmployeeById() 
	    {
	    	
	        System.out.println("Enter Employee id");
	        int empId=sc.nextInt();
	        Employee emp=e.stream().filter(id->id.getId()==empId).collect(Collectors.toList()).get(0);
	            System.out.println(emp);
	       
	    }
	   

	    
	 

	    @Override
	    public void getEmployeeBySalary() 
	    {
	        System.out.println(e.stream().mapToDouble(e->e.getSalary()).max().getAsDouble());
	    }

	 

	    public void getEmployeeByName() {
	    	
	    	
	    	System.out.println("Enter Employee Name :");
	        String name=sc.next();
	        ArrayList<Employee> empByName=(ArrayList<Employee>)e.stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
	        empByName.stream().forEach(t->System.out.println(t));
	        
	    }

	 

	    @Override
	    public void getEmployeeByDept() {
	        System.out.println("Employee By Department..");
	        
	        ArrayList<Employee> empByName=(ArrayList<Employee>)e.stream().filter(t->t.getDepartment().equals("Testing")).collect(Collectors.toList());
	        empByName.stream().forEach(t->System.out.println(t));
	        
	    }
	        
	}

