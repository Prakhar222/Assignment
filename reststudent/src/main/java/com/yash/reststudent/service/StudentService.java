package com.yash.reststudent.service;

import java.util.List;

import com.yash.reststudent.model.Student;

public interface StudentService 
{
	public void addStudent(Student student);
	public List<Student> getAllStudents();
	public void updateStudent(Student student);
	public void  deleteStudent(Student student);
}
