Prime:
import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1)
        {
            System.out.println("Not prime");
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                break;
            }
        else
        {
            System.out.println("Prime");
            break;
        }
        }
    }
}
________________________________________________________________
Using Factors:Factor count.
_______________________________________________________
