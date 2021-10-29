package com.yash.reststudent11.dao;

import java.util.List;



import com.yash.reststudent11.model.Student;



public interface StudentDAO {
	public List<Student> getAllStudents();
	public List<Student> addStudent(Student student);
	public List<Student> removeStudent(Student student);
	public List<Student> updateStudent(Student student);
}
