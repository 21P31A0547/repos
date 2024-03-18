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
if((a==b)&&(b==c)&&(c==a))
{
System.out.println("equilateral");
}
else if(a==b ||b==c||c==a)
{
System.out.println("Isosceles");
}
else
{
System.out.println("Scalene");
}
}
}
