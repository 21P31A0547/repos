class Inherithi4
{
public static void main(String args[])
{
//parent p=new parent();
 child c=new child();
c.displayx();
c.displayy();
subchild d=new subchild();
d.displayz();
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
int y=20;
public void displayy()
{
System.out.println(y);
}
}
class subchild extends parent
{
int z=30;
public void displayz()
{
System.out.println(z);
}
}