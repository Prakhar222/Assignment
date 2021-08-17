package com.yash.newconcepts.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileDemo {
	public static void main(String args[])
	{
		try
		{
			File f=new File("demo2.txt");
			System.out.println("File name"+f.getName()+"File path"+f.getPath()+"File parent"+f.getParent());
			FileInputStream in=new FileInputStream(f);
			f.exists();
			int i;
			while((i=in.read())!=1)
				System.out.println((char)i);
				FileReader f1=new FileReader(f);
				/*while((i=f1.read())!=-1)
				{
				System.out.println((char)i);	
				}*/
				
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
