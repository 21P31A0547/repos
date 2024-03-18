import java.util.*;
class String1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1="Aditya Engineering College";
System.out.println(s1.length());
System.out.println(s1.isEmpty());
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.concat(("A")));
System.out.println(s1.indexOf('d'));
System.out.println(s1.lastIndexOf('e'));
System.out.println(s1.charAt(24));
System.out.println(s1.equals("aditya engineering college"));
System.out.println(s1.equalsIgnoreCase("aditya engineering college"));
System.out.println(s1.substring(7));
System.out.println(s1.substring(7,18));
System.out.println(s1.contains("aditya"));
}
}