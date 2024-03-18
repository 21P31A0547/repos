abstract class vehicle
{
public abstract int getno_ofwheels();
public abstract int seating_capacity();
}
class bike extends vehicle
{
public int getno_ofwheels()
{
return 2;
}
public  int seating_capacity()
{
return 2;
}
}
class Auto extends vehicle
{
public int getno_ofwheels()
{
return 3;
}
public  int seating_capacity()
{
return 4;
}
}
class Car extends vehicle
{
public int getno_ofwheels()
{
return 4;
}
public  int seating_capacity()
{
return 6;
}
}

class abstractmain
{
public static void main(String args[])
{
vehicle v;
int w,c;
v= new bike();
System.out.println("========");
System.out.println("Bike:");
w=v.getno_ofwheels();
c=v.seating_capacity();
System.out.println("no of wheels"+w);
System.out.println("seating capacity"+c);
System.out.println("========");
v= new Auto();
System.out.println("========");
System.out.println("Auto:");
w=v.getno_ofwheels();
c=v.seating_capacity();
System.out.println("no of wheels"+w);
System.out.println("seating capacity"+c);
System.out.println("========");
v= new Car();
System.out.println("========");
System.out.println("Car:");
w=v.getno_ofwheels();
c=v.seating_capacity();
System.out.println("no of wheels"+w);
System.out.println("seating capacity"+c);
System.out.println("========");
}
}


