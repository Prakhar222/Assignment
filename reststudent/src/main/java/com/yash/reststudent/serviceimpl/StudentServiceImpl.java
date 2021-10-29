package com.yash.reststudent.serviceimpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Collection;

import com.yash.reststudent.model.Student;
import com.yash.reststudent.service.StudentService;
import com.yash.reststudent.service.*;
public class StudentServiceImpl implements StudentService 
	{
	ArrayList<Student> stud=new ArrayList <Student>();

	@Override
	public void addStudent(Student student) {
	
		stud.add(new Student(1,"Allen","Indore"));
		stud.add(new Student(2,"alex","Pune"));
		stud.add(new Student(3,"Robert","Hyd"));
		
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return stud;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
