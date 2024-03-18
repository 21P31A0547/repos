import java.util.*;
public class Solution
{
Scanner sc=new Scanner(System.in);
System.out.println("enter m");
int m=sc.nextInt();
int beg=0,end=m-1,i,mid,n;
int arr[]=new int[m];
for(i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
System.out.println("enter n");
n=sc.nextInt();
while(end>=beg)
{
 mid=(end+beg)/2;
if(arr[mid]==n)
{
System.out.println(mid);
}
if(arr[mid]>n)
{
end=mid-1;
}
else
{
beg=mid+1;
}
}
}

