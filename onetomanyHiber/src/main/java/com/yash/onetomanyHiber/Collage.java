package com.yash.onetomanyHiber;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Collage {
private int collageId;
private String collageName;
private List <Student> students;
@Id
@GeneratedValue
public int getCollageId() {
	return collageId;
}
public void setCollageId(int collageId) {
	this.collageId = collageId;
}
public String getCollageName() {
	return collageName;
}
public void setCollageName(String collageName) {
	this.collageName = collageName;
}
@OneToMany(mappedBy = "collage",fetch=FetchType.EAGER)
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

}
