package com.java.code;

public class Employee {
	String firstname;
	String lastname;
	String Company;;
	String Role;
	 String a1;
	 String b;
	 String c;
	 String d;
	 String P;
	public void setter(String firstname,String lastname,String Company,String Role)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.Company=Company;
		this.Role=Role;
	
	}
	public Employee()
	{
		
		if(firstname=="Pankaj"|| lastname=="Sharma"||Company=="Yash"||Role=="Trainer")
		{
			  a1=firstname.substring(0,2);
			  b=lastname.substring(0,2);
			  c=Company.substring(0,2);
			  d=Role.substring(0,2);
			 
			
		}

	}
	public void generatePassword()
	
	{
		  System.out.println(firstname.substring(0,2)+lastname.substring(0,2)+Company.substring(0,2)+Role.substring(0,2));

		
		
	}

	
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setter("Pankaj", "sharma", "yash", "trainer");
		//e.generatePassword();
		e.generatePassword();
	}
}

