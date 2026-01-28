package Day8;

public class Deletevowels {
    public static void main(String[] args) {
        String input = "HeLLo WoRLd From Java";
        String vowels = "AEIOUaeiou";

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (vowels.indexOf(ch) != -1) {  
                sb.deleteCharAt(i);
                i--; 
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Without Vowels: " + sb.toString());
    }
}