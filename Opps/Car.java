package com.yash.oopsconceptdemo1;

public class Car {
	int speed;
	String carOwner;
	String carType;
    static int count=0;

	 void setDetails(int speed,String carOwner ,String carType)
	 {
		  		this.speed=speed;
				this.carOwner=carOwner;
				this.carType=carType;
				count++;
	}
	
	void getDetails()
	{
		System.out.println("Car speed\n"+speed+"\nCar Owner\n"+carOwner+"\nCar Type\n"+carType);
	}

	



}
