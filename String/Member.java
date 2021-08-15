package com.java.code;

public class Member {
	String firstname;
	String lastname;
	String Email;
	int Password;
	String Roll;
public void setter(String firstname,String lastname,String Email,String Roll,int Password)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.Email=Email;
	this.Roll=Roll;
	this.Password=Password;
}
public void getter()
{
	System.out.print(firstname);
	System.out.println(lastname);
	System.out.println(Email);
	System.out.println("Password:"+Password);
	System.out.println(Roll);
}
public static void main(String args[])
{
Member m1=new Member();
m1.setter("Name:Pankaj","Sharma", "Email:sharma.pankaj@yash.com","Role:Trainer",12345 );
m1.getter();

}

}
