package com.yash.newconcepts.collection;

import java.util.ArrayList;

import java.util.List;
public class Spliterator {
public static class SpliteratorSequentialIteration
{
  public static void main(String[] args) 
  {
	ArrayList<String> names = new ArrayList<>();
	names.add("Ram");
	names.add("Mohan");
	names.add("Sohan");
		
	
	java.util.Spliterator<String> namesSpliterator = names.spliterator();
		
	namesSpliterator.forEachRemaining((n) -> System.out.println(n));
			
   }
}
}