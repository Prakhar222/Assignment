package com.yash.oopsconceptdemo.exceptions;

public class NumberFormat {
public static void main(String args[])
{
	try
	{
	int num=Integer.parseInt("XYZ");
	}
	catch(NumberFormatException e)
	{
		System.out.println("Number Format Exception");
	}
}
}
