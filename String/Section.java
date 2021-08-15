package com.java.code;

public class Section {
int id;
String name;
String createDate; 
public void setter(int id,String name,String createDate)
{
	this.id=id;
	this.name=name;
	this.createDate=createDate;
}
public void getter()
{
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("createDate:"+createDate);
}
void showSectionDetail()
{
	setter(101,"name:core_java","31/01/2017");
	getter();
}
	public static void main(String args[])
{
Section s1=new Section();
s1.showSectionDetail();
}
	
	
}
