import java.util.Scanner;
import aec.cse.stringpractice;
class user
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
      stringpractice s=new stringpractice();
      String input=sc.nextLine();
      System.out.println("Reverse of given input="+s.rev(input));
      System.out.println("Given input is palinrome or not="+s.Palindrome(input));
       System.out.println("vowels="+s.VowelWord(input));
  }
}