import java.util.*;
class array sort
{
public static boolean issort (int arr[],int size)
{
for(i=0;i<n;i++)
{
if(arr[i]<arr[i-1])
return false;
}
return true;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,x[],i,res;
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
x[i]=sc.nextInt();
System.out.println(issort(x,n));
}
}
