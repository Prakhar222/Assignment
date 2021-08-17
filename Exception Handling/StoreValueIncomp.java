package com.yash.oopsconceptdemo.exceptions;
import java.util.*;

public class StoreValueIncomp {
public static void main(String args[])
{
	int []arr=new int[3];
	Scanner sc=new Scanner(System.in);
		
	for(int i=0;i<arr.length;i++)
	{		 
		System.out.println("Enter any valid Integer: ");
 
            
            try {
 
              
                arr[i] = Integer.parseInt(sc.next());
 
                System.out.println("You entered: "
                                   + arr[i]);
 
                
                
            }
 
            
            catch (NumberFormatException e) {
 
                System.out.println("Number Format Exception occured");
            }
		}
	}
}
	

	


