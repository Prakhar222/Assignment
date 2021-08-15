package com.java.code;

public class Documents {
String title;
String filepath;
public void setter(String title)
{
	this.title= title;
}
public void getter()
{
	System.out.println(title);
}


public static void main(String args[])
{
	Documents d1=new Documents();
	d1.setter("Mouse");
	d1.getter();
}
}
