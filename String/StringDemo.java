package com.java.code;
import java.util.Scanner;

public class StringDemo
{

Scanner sc = new Scanner(System.in);

String s=sc.nextLine();
String k="Java Test";
public void getter()
{
	System.out.println(s);
}


	public void getRequiredData()

	{
		
		if(s.equals(k))
		{
			System.out.println("Java Test string as it is");
		}
		else
		{
			System.out.println("there is no String should be returned ");
			
		}

	
    }
	public static void main(String args[])
	{
		
     StringDemo s=new StringDemo();
     s.getter();
     s.getRequiredData();
	}


}

