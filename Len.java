package Day9;

public class Len {

    public static void main(String[] args) {
        String s = "He is a good singer.";
        String result = "";
        result+=Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if ((i % 2) == 0) {
                result += Character.toUpperCase(s.charAt(i));
            } else {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}

