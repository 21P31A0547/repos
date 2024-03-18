/*class parent 
{
int x=10;
public void displayx()
{
System.out.println(x);
}
}
class child extends parent 
{
int y=10;
public void displayy()
{
System.out.println(y);
}
}*/
class Inherit 
{
public static void main(String args[])
{
parent p=new parent();
 child c=new child();
 p.displayx();
c.displayy();
}
}
class parent 
{
int x=10;
public void displayx()
{
System.out.println(x);
}
}
class child extends parent 
{
int y=10;
public void displayy()
{
System.out.println(y);
}
}