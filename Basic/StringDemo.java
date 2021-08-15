public class StringDemo
{
public static void main(String args[])
{
String str1="Mouse";
String str2=new String("Mouse");
System.out.println(str1.equals(str2));

String str3="Mouse";
System.out.println(str1.equals(str3));

String s1="mouse";
String g=s1.toUpperCase();
System.out.println(g)
;
String s2 = "MOUSE"; 
String g1 = s2.toLowerCase(); 
System.out.println(g1);

String s3="Run";
System.out.println(s3.replace('R','F'));
}
}
