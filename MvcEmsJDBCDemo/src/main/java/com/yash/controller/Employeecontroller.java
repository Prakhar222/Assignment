package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.dao.Employeedeo;
import com.yash.modal.Employee;

@Controller
public class Employeecontroller {

	@Autowired
	private Employeedeo employeedeo;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createStudent(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") double salary, @RequestParam("department") String department,@RequestParam("desiganation") String desiganation, @RequestParam("address") String address,ModelAndView mv) {

		Employee employee = new Employee(id,name,salary,department,desiganation,address);
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDepartment(department);
		employee.setDesiganation(desiganation);
		employee.setAddress(address);


		int counter = employeedeo.InsertEmployeeData(employee);

		if (counter > 0) {
			mv.addObject("msg", "Employee registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("create");

		return mv;
	}

}
