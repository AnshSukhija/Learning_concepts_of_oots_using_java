package Day8;

public class CapitalLettersUsingString {
    public static void main(String[] args) {
        String str = "HeLLo WoRLd From Java";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   // take each character
            if (ch >= 'A' && ch <= 'Z') {
                result = result +" "+ch;
            }
        }

        System.out.println("Capital letters: " + result);
    }
}
