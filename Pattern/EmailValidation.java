package com.yash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean emailCheck(String str)
	{
		String regex="^(.+)@(yash.+)$";
		Pattern p = Pattern.compile(regex);
		if(str==null)
		{
			return false;
		}
		Matcher m= p.matcher(str);
		return m.matches();
	}
public static void main(String args[])
{
	String str1="prakhar.gupta@yash.com";
	System.out.println(emailCheck(str1));
	String str2="dharmesh.rane@yash.com";
	System.out.println(emailCheck(str2));
	String str3="dharm5432ajs.com";	
	System.out.println(emailCheck(str3));
	}
}
