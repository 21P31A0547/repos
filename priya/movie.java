import java.util.*;
class movie
{
public static void main(String args[])
{
int hit,flop,avg,hit1,flop1,avg1,h1,a1,f1,h2,a2,f2,sum1,sum;
String name1,name2;
Scanner sc=new Scanner(System.in);
name1=sc.nextLine();
name2=sc.nextLine();
hit=sc.nextInt();
avg=sc.nextInt();
flop=sc.nextInt();
hit1=sc.nextInt();
avg1=sc.nextInt();
flop1=sc.nextInt();
h1=hit*10;
a1=avg*5;
f1=flop*(-5);
h2=hit*10;
a2=avg*5;
f2=flop*(-5);
sum=h1+a1+f1;
sum1=h2+a2+f2;
if(sum>sum1)
{
System.out.println(name1+"is best");
}
else
{
System.out.println(name2+"is best");
}
}
}
