package com.yash.reststudent11.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.reststudent11.model.Student;
import com.yash.reststudent11.serviceimpl.StudentServiceImpl;
//@WebServlet("/getAllstudents")
@Path("/students")
public class StudentController 
{
	StudentServiceImpl simpl=new StudentServiceImpl();
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> addMsg(Student student)
	{
		return simpl.addStudent(student);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getStudents()
	{
		List listOfStudents=simpl.students();
		System.out.println(listOfStudents);
		return listOfStudents;
		
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> putStudent(Student student)
	{
		
		
		return simpl.updateStudent(student);
		
	}
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> deleteStudents(Student student)
	{
		
		
		return simpl.deleteStudent(student);
		
	}
}
