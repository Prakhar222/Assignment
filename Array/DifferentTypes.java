package com.yash;

public class DifferentTypes {
public static void main(String args[])
{
	int i;
	int pos=0;
	int Neg=0;
	int even=0;
	int odd=0;
	int []arr= {1,2,3,4,6,7,8,9,-10,11,-12,13,14,15};
	for(i=0;i>15;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.println("Even Number"+even);

		}
		else if(arr[i]>0)
		{
			System.out.println("Negative Number"+pos);

			
		}
		else if(arr[i]<0)
		{
			System.out.println("Positive Number"+Neg);
			
		}
		else
		{
			System.out.println("Positive Number"+odd);


		}
	
	}
	

}
}
