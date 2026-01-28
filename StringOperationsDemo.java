package Assessment_3;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String original = "Hello";
        System.out.println("Original String: " + original);
        String concatenated = original.concat(" World");
        System.out.println("After concatenation: " + concatenated);
        System.out.println("Original unchanged: " + original);
        System.out.println();

        demonstrateStringMethods("Java Programming");
        System.out.println();

        StringBuffer sb = new StringBuffer("Mutable");
        System.out.println("StringBuffer before: " + sb);
        sb.append(" Buffer");
        System.out.println("After append: " + sb);
        sb.insert(7, "String ");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.delete(0, 8);
        System.out.println("After delete: " + sb);
        System.out.println("StringBuffer is mutable—changes affect the same object.");

        StringBuilder sbd = new StringBuilder("Builder");
        sbd.append(" Example");
        System.out.println("\nStringBuilder after append: " + sbd);
    }

    public static void demonstrateStringMethods(String str) {
        try {
            System.out.println("String: " + str);
            System.out.println("Length: " + str.length());
            System.out.println("Char at index 0: " + str.charAt(0));
            System.out.println("Substring from index 5: " + str.substring(5));
            System.out.println("Equals 'Java': " + str.equals("Java"));
            System.out.println("Replace 'a' with 'A': " + str.replace('a', 'A'));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index - " + e.getMessage());
        }
    }
}
