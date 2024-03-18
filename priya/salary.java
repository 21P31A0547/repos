import java.util.*;
class salary
{
public  static void main(String args[])
{
int b_salary,gross,hra,da;
Scanner sc=new Scanner(System.in);
b_salary=sc.nextInt();
if(b_salary<=10000)
{
hra=20;
da=80;
hra=(b_salary*hra)/100;
da=(b_salary*da)/100;
}
else if((b_salary<=20000))
{
 hra=25;
da=90;
hra=(b_salary*hra)/100;
da=(b_salary*da)/100;
}
else
{
 hra=30;
da=95;
hra=(b_salary*hra)/100;
da=(b_salary*da)/100;
}
gross=hra+da+b_salary;
System.out.println(gross);
}
}


