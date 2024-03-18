import java.util.Arrays;
class Package2
{
public  static void main(String args[])
{
int x[]={10,50,30,2,40};
int y[]={10,20,3,5};
System.out.println("before sorting");
for(int ele:x)
System.out.println(ele+"");
System.out.println();
Arrays.sort(x);
System.out.println("After sorting");
for(int ele:x)
System.out.println(ele+"");
System.out.println(Arrays.equals(x,y));
}
}