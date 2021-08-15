package com.yash.oopsconceptdemo.exceptions;

import java.util.Scanner;

public class Product {
public static void main(String args[])
{
	String []arr= {"Mobile","Earphone",null};
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<arr.length;i++)
	{		 
            
            
            try {
 
              
                if(arr[i]==null)
                {
 
                System.out.println("You entered: "
                                   + arr[i].length());
                }
                
                
             }
 
            
            catch (NullPointerException e) {
 
                System.out.println(
                    "Null Pointer Exception occured");
            }
		}
	}
}