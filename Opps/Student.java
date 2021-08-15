package com.yash.oopsconceptdemo1;

public class Student {
String Student_Name;
int Student_ID;
int Student_Class;
int count=0;
void setDetails(int Student_ID,String Student_Name,int Student_Class)
{
	this.Student_Class=Student_Class;
	this.Student_ID=Student_ID;
	this.Student_Name=Student_Name;
	count++;
	
}
void getDetails()
{
	System.out.println("Student ID\n"+Student_ID+"\nStudent Name\n"+Student_Name+"\nStudent Class\n"+Student_Class);
}
}
