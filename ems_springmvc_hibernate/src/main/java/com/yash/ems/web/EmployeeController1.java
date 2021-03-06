//package com.yash.ems.web;
//
//
//import java.io.IOException;
//import java.util.*;
//
//
//import javax.validation.Valid;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.yash.ems.dao.EmployeeDao;
//
//import com.yash.ems.model.Employee;
//
//@Controller
//@RequestMapping(value="/")
//public class EmployeeController1 
//{
//	//EmployeeDaoImpl employeedao = new EmployeeDaoImpl();
//	 
//	    
//	 //  Employee employee = new Employee();
//	
//	    @Autowired
//	    private EmployeeDao employeedao;
//	    /**
//	     * this request mapping is for the geeting list from table
//	     * @param model
//	     * @return
//	     */
//	    @RequestMapping(value = "/list",method = RequestMethod.GET)
//		public String getList(ModelMap model) 
//		{
//			List<Employee> emplist = employeedao.findAll();
//			model.addAttribute("emplist", emplist);
//			return "empllist";
//		}
//	    
//	    /**
//	     * this method for the register the new employee
//	     * @param model
//	     * @return
//	     */
//	    @RequestMapping(value = "/save",method = RequestMethod.GET)
//		public String newRegistration(ModelMap model) 
//		{
//			Employee employee = new Employee();
//			model.addAttribute("employee", employee);
//			return "enroll";
//		}
//		
//		/*
//		* This method will be called on form submission, handling POST request It
//		* also validates the user input
//		*/
//		
//		@RequestMapping(value = "/save",method = RequestMethod.POST)
//		public String saveRegistration(@Valid Employee employee,BindingResult result, ModelMap model)
//		{
//			if (result.hasErrors()) 
//			{
//				return "enroll";
//			}
//			
//			employeedao.save(employee);
//			
//			model.addAttribute("success", "Dear " + employee.getName() + " , your registration completed successfully");
//			return "success";
//		}
//
//		/*
//		* Method used to populate the Department list in view. Note that here you can
//		* call external systems to provide real data.
//		*/
//		
//		@ModelAttribute("department")
//		public List<String> initializeDepartments()
//		{
//			List<String> department = new ArrayList<String>();
//			department.add("IT");
//			department.add("Testing");
//			department.add("Research");
//			department.add("HR");
//			department.add("Finance");
//			return department;
//		}
//		
//		/*
//		* Method used to populate the country list in view. Note that here you can
//		* call external systems to provide real data.
//		*/
//		
//		@ModelAttribute("countries")
//		public List<String> initializeCountries()
//		{
//			List<String> countries = new ArrayList<String>();
//			countries.add("INDIA");
//			countries.add("USA");
//			countries.add("UAE");
//			countries.add("GERMANY");
//			countries.add("ITALY");
//			countries.add("OTHER");
//			return countries;
//		}
//		
//		/**
//		 * this request mpping is for delete record 
//		 */
//		@RequestMapping(value = "/delete",method = RequestMethod.GET)
//		public String deletepage(ModelMap model) 
//		{
//			Employee employee = new Employee();
//			model.addAttribute("employee", employee);
//			return "delete";
//		}
//		
//		@RequestMapping(value = "/delete",method = RequestMethod.POST)
//		public String deleteEmp(Employee employee,BindingResult result, ModelMap model)
//		{
//			int empid = (int) employee.getId();
//			employeedao.delete(empid);
//
//			model.addAttribute("success", " Record has been deleted successfully");
//			return "successupdation";
//		}
//		/**
//		 * this request mapping is for update employee
//		 */
//		@RequestMapping(value = "/update",method = RequestMethod.GET)
//		public String newRegistration1(ModelMap model) 
//		{
//			Employee employee = new Employee();
//			model.addAttribute("employee", employee);
//			return "updateform";
//		}
//		
//		/*
//		* This method will be called on form submission, handling POST request It
//		* also validates the user input
//		*/
//		
//		@RequestMapping(value = "/update",method = RequestMethod.POST)
//		public String saveRegistration(Employee employee, ModelMap model)
//		{
//			employeedao.update(employee);
//			
//			model.addAttribute("success", "Dear " + employee.getName() + " , your record updated successfully");
//			return "successupdation";
//		}
//		
//		
//		/*
//		* Method used to populate the Department list in view. Note that here you can
//		* call external systems to provide real data.
//		*/
//		
//		@ModelAttribute("department")
//		public List<String> initializeDepartments1()
//		{
//			List<String> department = new ArrayList<String>();
//			department.add("IT");
//			department.add("Testing");
//			department.add("Research");
//			department.add("HR");
//			department.add("Finance");
//			return department;
//		}
//		
//		/*
//		* Method used to populate the country list in view. Note that here you can
//		* call external systems to provide real data.
//		*/
//		
//		@ModelAttribute("countries")
//		public List<String> initializeCountries1()
//		{
//			List<String> countries = new ArrayList<String>();
//			countries.add("INDIA");
//			countries.add("USA");
//			countries.add("UAE");
//			countries.add("GERMANY");
//			countries.add("ITALY");
//			countries.add("OTHER");
//			return countries;
//		}
//		
//		
//	 
//}
