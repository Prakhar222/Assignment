  
package com.yash.newconcepts.io;
/**
*
*@Prakhar Gupta
*
*
 */
import java.io.*;
import java.io.FileInputStream;

public class FileDemo {

	public static void main(String[] args) 
	{
	try
	{
		File f=new File("demo1.txt");
		
		System.out.println(" File name:- "+f.getName()+ " File Path:- "
		+ f.getPath()+ " File Parent:- "+ f.getParent()+ " File exist:- "
		+ f.exists());
		
		FileInputStream in=new FileInputStream(f);
		
		int i;
		
		while((i=in.read())!=-1)
			System.out.println((char)i);
		FileReader f1=new FileReader(f);
		while((i=f1.read())!=-1)
			System.out.println((char)i);
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
