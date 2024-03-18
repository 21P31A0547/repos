import java.util.Scanner;
import mypack.testpack.Compare;
class Customer
{
  public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
Compare c= new Compare();
int m,n,o;
m=sc.nextInt();
n=sc.nextInt();
o=sc.nextInt();
System.out.println("Maximum:"+c.greaterValue(m,n,o));
System.out.println("Minimum:"+c.lesserValue(m,n,o));
}
}