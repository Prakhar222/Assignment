package com.yash;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword 
{

	private static boolean checkPassword(String str) 
	{
		String regex="^[A-S][02468][a-z A-Z 0-9 $#]*(1)";
		
		
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
		String str1="Prakha2#1";
		System.out.println(checkPassword(str1));
		String str2="praK12#@Har";
		System.out.println(checkPassword(str2));
		String str3="P2#karelii1";
		System.out.println(checkPassword(str3));
		String str4="uassword#$99";
		System.out.println(checkPassword(str4));
		String str5="$prAK3kareli#";
		System.out.println(checkPassword(str5));
	}
}