package com.springcore.lifecylce;

public class Food {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting Price");
	this.price = price;
}

public Food() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Food [price=" + price + "]";
}
public void init() {
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method");	
}

}
