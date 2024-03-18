import java.util.*;

public class A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "pavani";
        String s1 = "avanip";
        char arr[] = s.toCharArray();
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int n = arr.length;
        if (Arrays.equals(arr, arr1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
