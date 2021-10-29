package com.springcore.lifecylce;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "ColdDrink [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("taking colddrink:init");
	
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("going to put bottle back to shop after drinking:destroy");
	
}

}
