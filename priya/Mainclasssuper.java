class parent
{
public void show()
{
System.out.println("GangLeader");
}
}
class child extends parent
{
public void show()
{
super.show();
System.out.println("RRR");
}
}
class Mainclasssuper
{
public static void main(String args[])
{
child c=new child();
c.show();
}
}