import java.util.*;
class Solution
 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int i,n,flag=0,re=-1;
        n=sc.nextInt();
        int[] nums = new int[7];    
for( i=0; i<nums.length; i++)  
{    
nums[i]=sc.nextInt();  
}  
    for( i=0;i<nums.length;i++)
           {
               if(nums[i]==n)
               {
                  flag=1;
                  re=i+1+re;
               }
           }
           if(flag==1)
           {
            System.out.println("found at"+re);
           }
           else
           {
            System.out.println("not found");
           }
           
}
               }
            
    
