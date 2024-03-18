package aec.cse;
public class stringpractice 
{
public String rev( String str)
{
	String s="";
        for(int i=0;i<str.length();i++)
{
s=str.charAt(i)+s;
}
return s;
   }
public  boolean Palindrome(String str)
   {
	  String rev= rev(str);
        if(str.equals(rev))
return true;
else
 return false;
   }

public String VowelWord(String str)
  {
     String vowels="AEIOUaeiou";
     String ret_String="";
	 for(int i=0;i<str.length();i++)
	 {
	   char ch=str.charAt(i);
          if(vowels.contains(ch+""))
            ret_String=ret_String+ch;
	}
         return ret_String;
  }
}
