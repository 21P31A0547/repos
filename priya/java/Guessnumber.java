import java.util.*;

public class Guessnumber{
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        playGame();
        sc.close(); 
    }

    public static void playGame() {
        int randomInt = random.nextInt(100);
        System.out.println("Enter a Guess Number");

        int k = sc.nextInt();
        if (randomInt == k) {
            System.out.println("Your Guess is Correct");
        } else {
            System.out.println("Your Guess is wrong");
            System.out.println("Do You want the Answer to be Released?");
            System.out.println("Type yes or no");
            sc.nextLine();

            String s = sc.nextLine();
            if (s.equals("yes")) {
                System.out.println(randomInt);
                System.exit(0);
            } else {
                if (k < randomInt) {
                    System.out.println("Your guess is Less than the Generated Number");
                } else if (k > randomInt) {
                    System.out.println("Your guess is Greater than the Generated Number");
                }
            }
        }

        System.out.println("Do you want to guess again?");
        System.out.println("Type yes or no ");
        String s1 = sc.nextLine();
        if (s1.equals("yes")) {
            playGame();
             }
        else
        {
            System.out.println(randomInt);
            System.exit(0);
            }
    }
}