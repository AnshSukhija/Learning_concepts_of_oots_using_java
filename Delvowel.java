package Day9;

public class Delvowel {
    public static void main(String[] args) {
        StringBuilder inp = new StringBuilder("Hello world of Java");
        String check = "aeiouAEIOU";
        for (int i = 0; i < inp.length(); i++) {
            if (check.indexOf(inp.charAt(i)) >= 0) {
                inp.deleteCharAt(i);
                i--; // Decrement index to re
            }
        }
        System.out.println(inp);
    }
}