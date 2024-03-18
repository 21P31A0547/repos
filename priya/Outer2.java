class Outer2
{
class inner
{
public void m1()
{
System.out.println("INNER CLASS");
}
}
public void m2()
{
inner i = new inner();
i.m1();
}
public static void main(String args[])
{
Outer2 o =new Outer2();
o.m2();
}
}