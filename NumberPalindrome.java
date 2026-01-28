package Assignment;
import java.util.*;
class Palindrome{
	void check(int num) 
	{
		int original = num;
        int reversed = 0;
        while (num > 0) 
        {
            int digit = num % 10;     // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;           // remove last digit
        }
        if (original == reversed) 
        {
            System.out.println(original + " is a Palindrome.");
        } 
        else {
            System.out.println(original + " is NOT a Palindrome.");
        }
	}
}
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        Palindrome p = new Palindrome();

	        p.check(number);

	        sc.close();
	}
}
