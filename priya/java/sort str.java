sort strings in aplhaetical order:
___________________________________
import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=sc.nextLine();
        String f=s+k;
        char arr[]= f.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
________________________________________