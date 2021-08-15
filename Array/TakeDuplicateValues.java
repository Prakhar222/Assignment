package com.yash;

public class TakeDuplicateValues {
	 public static void main(String[] args) 
	    {
	        String []pro = {"Lux Soap","WasingPowdwe","Lux Soap"};
	 
	        for (int i = 0; i < pro.length-1; i++)
	        {
	            for (int j = i+1; j < pro.length; j++)
	            {
	                if ((pro[i] == pro[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+pro[j]);
	                }
	            }
	        }

	    }
}
