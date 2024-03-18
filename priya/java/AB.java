import java.util.Stack;
import java.util.Scanner;

public class Ab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            s.push(m);
        }
        
        System.out.println("Reversed order:");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
