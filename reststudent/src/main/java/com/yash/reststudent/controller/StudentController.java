package com.yash.reststudent.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.reststudent.service.StudentService;
import com.yash.reststudent.serviceimpl.StudentServiceImpl;
//@WebServlet("/getAllstudents")
@Path("/students")
public class StudentController 
{
	StudentServiceImpl simpl=new StudentServiceImpl();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getStudents()
	{
		List listOfStudents=simpl.getAllStudents();
		return listOfStudents;
		
	}
}
