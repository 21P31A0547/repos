import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
         int index=0;
        int arr1[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<6;j++)
       {
        if(arr[j]!=0)
        {
            arr1[index++]=arr[j];
            
        }
      }
      for(int k=0;k<6;k++)
      {
          System.out.println(arr1[k]);
      }
    }
}