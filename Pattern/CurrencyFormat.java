package com.yash;

import java.util.Scanner;

public class CurrencyFormat {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		String cdata="";
		int rm=data.length() % 3;
		if(data.length()<=3)
		{
			cdata=data;

		}
		else {
			for(int p=data.length()-3;p>=0;p=p-3)
			{
				String temp=data.substring(p,p+3);
				cdata=""+temp+cdata;
			}
			String rms=data.substring(0,rm);
			cdata=rms+cdata;
			if(cdata.startsWith(","))
			{
				cdata=cdata.substring(1);
			}
		}
		System.out.println(cdata);
		sc.close();

	}
}
