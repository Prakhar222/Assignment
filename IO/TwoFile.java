package com.yash.newconcepts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TwoFile {

public static void main(String args[]) throws IOException
{
FileInputStream fis=new FileInputStream("file1.txt");
FileOutputStream fos=new FileOutputStream("file2.txt");
int c;
while((c=fis.read())!=-1)
{
	System.out.println((char)c);
	fos.write(c);
}
}
}
