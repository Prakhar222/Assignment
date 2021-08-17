package com.yash.newconcepts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class BufferDemo {
public static void main(String args[]) throws IOException
{
	try(FileInputStream fin =new FileInputStream("abc.txt");
  BufferedInputStream bin = new BufferedInputStream(fin);)
  {
	  int x=0;
  while((x=bin.read())!=1)
	  System.out.println((char)x);
  }
catch(Exception e)
{
	System.out.println(e);
}
	
}

}