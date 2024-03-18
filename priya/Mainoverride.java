class parent 
{
public void display()
{
System.out.println("Hi");
}
}
class child extends parent 
{
public void display()
{
System.out.println("Bye");
}
}
class Mainoverride
{
public static void main(String args[])
{
parent p=new parent();
p.display();
 child c=new child();
c.display();

}
}