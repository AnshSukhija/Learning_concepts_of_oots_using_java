package Day9;

public class Swapper {
    public static void swapper1(int n, String a, String b, String sub) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res = res + a.charAt(i) + b.charAt(i);
        }
        res += sub;
        System.out.println(res);
    }

    public static void main(String[] args) {
        String a = "Auh ho!";
        String b = "n, s,";

        if (a.length() < b.length()) {
            // a is smaller → pair up till a.length(), then append remaining of b
            swapper1(a.length(), a, b, b.substring(a.length()));
        } else {
            // b is smaller → pair up till b.length(), then append remaining of a
            swapper1(b.length(), a, b, a.substring(b.length()));
        }
    }
}
