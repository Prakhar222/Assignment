package com.yash.newconcepts.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read {
	public static void main(String args[]) throws IOException
	{
	FileInputStream fis=new FileInputStream("company/basicInfo.txt");
	
	int c;
	while((c=fis.read())!=-1)
	{
		System.out.println((char)c);
		
	}
	}
}
