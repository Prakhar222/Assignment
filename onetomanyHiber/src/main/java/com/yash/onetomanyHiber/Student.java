package com.yash.onetomanyHiber;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Student {
private int studentId;
private String studentName;
private Collage collage;

@ManyToOne
@JoinColumn(name="collage_id")
public Collage getCollage() {
	return collage;
}
public void setCollage(Collage collage) {
	this.collage = collage;
}
@Id
@GeneratedValue
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
}
