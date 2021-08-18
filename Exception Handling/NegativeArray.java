package com.yash.oopsconceptdemo.exceptions;

	import java.util.*;

	public class NegativeArray
	{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);

	int sz;
	int[] arr;
	System.out.println("Enter array size:--");
	sz = scan.nextInt();

	try
	{
	arr = new int[sz];
	}
	catch (NegativeArraySizeException e)
	{
	System.out.println("Negative size of array");
	System.out.println("Array was't created" +e);
	return;
	}

	catch (NumberFormatException e)
	{
	System.out.println("Error numeric format");
	System.out.println("Array was't created" +e);
	return;
	}

	System.out.println("Array created succesuful.\n Enter values in the array");

	for (int i = 0; i < sz; i++)
	arr[i] = scan.nextInt();
	System.out.println("Enter indexing you want");
	sz = scan.nextInt();

	try
	{
	System.out.println(arr[sz - 1]);
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Error in index" +e);
	}
	}
	}

