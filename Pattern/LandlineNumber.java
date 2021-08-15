package com.yash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LandlineNumber {
	private static boolean isValidLandlineNumber(String str) {

		String regex="^[0755]{4}\\-[0-9]{6}{8}$";
		Pattern p = Pattern.compile(regex);
		
		if(str == null)
		{
			return false;
		}
		Matcher m=p.matcher(str);
		return m.matches();
	}
	


	public static void main(String args[])
{
String str1="0755-27654268";
System.out.println(isValidLandlineNumber(str1));
String str2="0755-765426";
System.out.println(isValidLandlineNumber(str2));
String str3="0755-26546";
System.out.println(isValidLandlineNumber(str3));
String str4="0755-2765426";
System.out.println(isValidLandlineNumber(str4));
String str5="0755-27654269";
System.out.println(isValidLandlineNumber(str5));
}
	

	
}
