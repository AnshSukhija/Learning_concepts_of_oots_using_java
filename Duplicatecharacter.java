package Day8;
import java.util.Scanner;
public class Duplicatecharacter {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a String:");
    	String str=sc.nextLine();
        String result = "";
        String processed = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (processed.indexOf(ch) == -1) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count > 1) {
                    result += ch + " : " + count + "\n";
                }

                processed += ch;
            }
        }

        System.out.println("Duplicate characters and their counts:");
        System.out.println(result);
    }
}