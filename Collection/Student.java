package com.yash.newconcepts.collection;
import java.util.LinkedList;
public class Student {
		public static void main(String[] args) {
		    LinkedList<String> student = new LinkedList<String>();
		    student.add("Krishna");
		    student.add("Mohan");
		    student.add("Madhav");
		    student.add("Krishna");
		    System.out.println(student);

		    student.addFirst("Ram");
		    student.addLast("Govind");
		    System.out.println(student);
		    
		    student.removeFirst();
		    System.out.println(student);
		    
		    student.removeLast();
		    System.out.println(student);
		    
		    System.out.println(student.getFirst());
		    System.out.println(student.getLast());
		    

		  }
		}



