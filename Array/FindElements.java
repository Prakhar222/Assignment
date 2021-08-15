package com.yash;
import java.util.Scanner;
public class FindElements {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i;
		int flag=0;
		System.out.println("Enter number : ");
		for (i = 0; i<10; i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter element for search:");
		int a=sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(arr[i]==a)
			{
				flag++;
			}
		}
		if(flag>0)
		{
			System.out.println("The Data you want to search is present");

		}
		else
		{
			System.out.println("The Data you want to search is not present");
	
		}
		
	}

}
