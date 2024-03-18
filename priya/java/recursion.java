import java.util.*;
public class A
{
     public int fun(int i,int n)
     {
         if(n<=1)
         {
             return 1;
         }
         else
         {
             return n*fun(i,n-1);
         }
     }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        A o=new A();
        int r=o.fun(1,5);
        System.out.println(r);
    }
}