package Day9;
import java.util.*;
public class RepeatSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int n = input.length();

        // Take first 2 chars (or fewer if string is shorter)
        String sub = input.length() < 2 ? input : input.substring(0, 2);

        // Build result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(sub);
        }

        // Print result
        System.out.println("Output: " + result.toString());

        sc.close();
    }
}
