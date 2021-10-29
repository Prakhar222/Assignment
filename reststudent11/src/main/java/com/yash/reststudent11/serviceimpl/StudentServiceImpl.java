package com.yash.reststudent11.serviceimpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Collection;

import com.yash.reststudent11.dao.StudentDAO;
import com.yash.reststudent11.daoimpl.StudentDAOImpl;
import com.yash.reststudent11.model.Student;
import com.yash.reststudent11.service.*;
public class StudentServiceImpl implements StudentService 
{
	StudentDAOImpl sd=new StudentDAOImpl();
	ArrayList<Student> stud=students();


	@Override
	public List<Student> addStudent(Student st) {
		//stud.add(st);
		
		return sd.addStudent(st);
	}

	public ArrayList<Student> students()
	{
		ArrayList<Student> stud1=new ArrayList<Student>();
		stud1.add(new Student(1,"Allen","Indore"));
		stud1.add(new Student(2,"alex","Pune"));
		stud1.add(new Student(3,"Robert","Hyd"));

		return stud1;
	}
	@Override
	public List<Student> getAllStudents() {
		return sd.getAllStudents();
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		/*int	id=student.getId();
		for (Student student2 : stud) {
			if (student2.getId()==id) {
				stud.remove(student2);
				break;
			}

		}
		stud.add(student);*/
		return (ArrayList<Student>) sd.updateStudent(student);
	}

	@Override
	public ArrayList<Student> deleteStudent(Student student) {
//		int	id=student.getId();
//		for (Student student2 : stud) {
//			if (student2.getId()==id) {
//				stud.remove(student2);
//				break;
//			}
//
//		}
		return (ArrayList<Student>) sd.removeStudent(student);

	}


}
