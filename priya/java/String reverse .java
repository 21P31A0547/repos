String reverse :
When custom input is taken :

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String A ="Pavani";
     String k="";
     for(int i=A.length()-1;i>=0;i--)
     {
         k=k+A.charAt(i);
     }
     System.out.println(k);
    }
}
when input to be taken from user:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter string");
     String a = sc.nextLine();
      String k="";
     for(int i=a.length()-1;i>=0;i--)
     {
         k=k+a.charAt(i);
     }
     System.out.println(k);
    }
}
_____________________________________________________________________________________________________________________________________
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        StringBuilder s = new StringBuilder(inputString);
        System.out.println("Reversed string: " + s.reverse());
    }
}



Stringbuffer:


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        StringBuffer s = new StringBuffer(inputString);
        System.out.println("Reversed string: " + s.reverse());
    }
}

__________________________________________________________________________________________________________________________
Series of even numbers:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n ;
     n=sc.nextInt();
     for( int i=n;i>=0;i--)
     {
         if(i%2==0)
         {
             System.out.println(i);
         }
     }
    }
}