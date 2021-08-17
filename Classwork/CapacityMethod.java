package com.yash.newconcepts.collection;

import java.util.ArrayList;
import java.util.*;
import java.lang.reflect.*;

public class CapacityMethod {
	
	 
	public static class ArrayListDefaultCapacityAndResizingExample {
	  public static void main(String args[]) {
	 
	     ArrayList <Integer> arrayList = new ArrayList<Integer>();
	     System.out.println("Default capacity is "+arrayList.size());
	     
	     arrayList.add(100);
	     System.out.println(arrayList.size());

	     arrayList.add(200);
	     arrayList.add(300);
	     arrayList.add(400);
	     
	     System.out.println(arrayList.size());
	     System.out.println(arrayList);
 	     arrayList.ensureCapacity(10);
	     arrayList.add(600);
	     
	     System.out.println(arrayList.size());

	     


	     


	 
	  }
	  
	}
	
}
	
