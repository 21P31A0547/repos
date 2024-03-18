import java.util.*;
class binary
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int beg=0,end=n-1,mid,m,flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        m=sc.nextInt();
        beg=0;
        end=n-1;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(arr[mid]==m)
            {
                flag=1;
                System.out.println(mid);
            }
            if(arr[mid]>m)
                end=mid-1;
            else
                beg=mid+1;
        }
        if(flag==1)
            System.out.println("elemnet found");
        else  
            System.out.println("not found");
        
    }
}