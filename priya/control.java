import java.util.*;
class control
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a+b>c )
{
System.out.println("Valid");
}
else if(a+c>b)
{
System.out.println("Valid");
}
else if(b+c>a)
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
}
}

