//package com.yash.controller;
//
//
//import java.io.IOException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//import com.yash.dao.Employeedeo;
//import com.yash.modal.Employee;
//
//@Controller
//public class ReadController {
//
//	@Autowired
//	private Employeedeo employeeDao;
//
//	@RequestMapping(value = "/read")
//	public ModelAndView readStudent(ModelAndView model) throws IOException {
//
//		List<Employee> listEmployee = employeeDao.read();
//		model.addObject("listStudent", listEmployee);
//		model.setViewName("read");
//
//		return model;
//	}
//}