package com.yash;

public class SameReverse {
		public static void main(String args[])
		{
			int []arr= {1,2,3,4,5,6};
			int []arr1=new int[6];
			int i;
			 for (i = 5; i >=0; i--)
			    {
			        arr1[i] = arr[5 - i ];
			    }
			 for (i = 0; i < 6; i++)
					System.out.println("Reverse order"+arr1[i]);
			    
		}

	}

