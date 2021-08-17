package com.yash.oopsconceptdemo.io;
import java.io.*;
public class DemoFile {
	public static void main(String args[])
	{
		try
		{
			File f=new File("demo.txtt");
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
