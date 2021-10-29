package com.yash.reststudent11.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.reststudent11.model.Student;

public interface StudentService 
{
	public List<Student> addStudent(Student st);
	public List<Student> getAllStudents();
	public ArrayList<Student> updateStudent(Student student);
	public List  deleteStudent(Student student);
	//List<Student> addStudent();
}
