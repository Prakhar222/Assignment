package com.yash;
import java.util.Scanner;
public class TakeInput {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		    int[] arr = new int[5];

		    
		    System.out.println("Default values of array:");
		    for (int i=0; i < arr.length; i++) {
		      System.out.print(arr[i]+"\t");
		    }

		    
		    System.out.println("Initializing Array");
		    System.out.println("Enter "+ arr.length
		                     + " integer values:");

		    for(int i=0; i < arr.length; i++) {
		      // read input
		      arr[i] = sc.nextInt();
		    }
		    System.out.println("Initialization completed\n");

		    System.out.println("Array elements are:");
		    for (int i=0; i < arr.length; i++) {
		      System.out.print(arr[i]+"\t");
		    }

		  }
}

