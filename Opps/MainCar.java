package com.yash.oopsconceptdemo1;

public class MainCar {

	public static void main(String args[])
	{

	Car c=new Car();
	Car c1=new Car();
	c.setDetails(400,"Ram","Sport");
	c1.setDetails(400,"Sham","Sport");
	c.getDetails();
	System.out.println("Number of Car Sold:"+c.count);
	}
}
