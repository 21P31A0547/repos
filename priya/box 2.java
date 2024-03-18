import java.util.*;
class Box2
{
double l,b,h,area,vol;
public Box()
{
l=b=h=1;
}
public Box(double d)
{
l=b=h=d;
}
public Box(double l,double b,double h)
{
this.l=l;
this.b=b;
this.h=h;
}
public double calArea()
{
return l*b;
}
public double calVol()
{
return l*b*h;
}
public void show()
{
System.out.println(l+""+b+""+h);
System.out.println("area="+calArea());
System.out.println("volume="+calVol());
Box b1=new Box();
b1.show();
Box b2=new Box(4);
b2.show();
Box b3=new Box();
b3.show();
}
}
 

