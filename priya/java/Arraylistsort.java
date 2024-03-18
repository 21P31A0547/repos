import java.util.*;
public class A
{
    public static void main(String args[])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
________________________________
import java.util.*;
public class A
{
    public static void main(String args[])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
       if(arr.contains(1))
       {
           System.out.println("Contains 1");
       }
       else
       {
           System.out.println("Doesnot contains 1");
       }
    }
}