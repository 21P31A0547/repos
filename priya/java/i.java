import java.util.*;
 public class A
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int k=0;
        for(int i=0;i<2;i++)
		{
		   k=n%10;
		   rem=rem*10+k;
		   n=n/10;
		}
		if(rem==0)
		{
		System.out.println("K"+rem+"0");
		}
		else{
		    System.out.println("K"+rem);
		}
	}
}