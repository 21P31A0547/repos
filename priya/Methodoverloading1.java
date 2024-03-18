class Methodoverloading1
{
public void swap(int x,int y)
{
System.out.println("Before Swapping "+x+" "+y);
int temp=x;
x=y;
y=temp;
System.out.println("After swapping"+x+" "+y);
}
public void swap(char ch1,char ch2)
{
System.out.println("Before Swapping "+ch1+" "+ch2);
char temp=ch1;
ch1=ch2;
ch2=temp;
System.out.println("After swapping"+ch1+" "+ch2);
}
public void swap(double a,double b)
{
System.out.println("Before Swapping "+a+" "+b);
double temp=a;
a=b;
b=temp;
System.out.println("After swapping"+a+" "+b);
}
public static void main(String args[])
{
Methodoverloading1 m=new Methodoverloading1();
m.swap(2,3);
m.swap('a','b');
m.swap(2.1,3.1);
} 
}



