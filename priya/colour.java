import java.util.*;
class colour
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.nextLine().charAt(0);
ch=Character.toUpperCase(ch);
switch(ch)
{
case 'V':
System.out.println("Violet");
break;
case'I':
System.out.println("Indigo");
break;
case'B':
System.out.println("Blue");
break;
case'G':
System.out.println("Green");
break;
case 'Y':
System.out.println("Yellow");
break;
case'O':
System.out.println("Orange");
break;
case'R':
System.out.println("Red");
break;
default:
System.out.println("idk");
break;
}
}
}

