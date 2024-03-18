
import java.io.*;
import java.util.*;

  public class GFG 
{
    public static void main(String[] args) throws IOException 
{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) 
{
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}
int beg=0,end=n-1,mid;
   mid=(beg+end)/2;
public int binarysearch(arr[],n,key)
{
while(beg<=end)
if(arr[mid]==key)
{
    System.out.println(mid);
}
if(arr[mid]<key)
{
 beg=mid+1;   
}
else
{
    end=mid-1;
}
}