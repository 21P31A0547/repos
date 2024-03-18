import java.util.*;
 class solution
{
    public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int rev=0,x,temp;
        temp=n;
        while(n!=0)
        {
            x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}