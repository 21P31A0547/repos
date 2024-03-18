 abstract class Parent
{
public void m1()
{
System.out.println("m1 method from Parent");
}
public void m2()
{
System.out.println("m2 method from Parent");
}
public abstract void m3(); 
}
class Child extends Parent
{
public void m2()
{
System.out.println("m2 method from child");
}
public void m3()
{
System.out.println("m3 method from child");
}
}
class Mainidk
{
public static void main(String args[])
{
Parent p=new Child();
p.m1();
p.m2();
p.m3();
}
}
