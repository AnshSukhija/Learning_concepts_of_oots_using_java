package Day9;

public class Printer {
    public static void main(String args[]) {
        String s = "Hello";
        String con = "";
        if (s.length() > 2) {
            for (int i = 0; i < s.length(); i++) {
                String sub = s.substring(0, 2);
                con = con + sub;
            }
            System.out.println("New string : " + con);
        } else {
            System.out.println("Insufficient length.");
        }

        String mail = "satipalguru@gmail.com";
        int ind = mail.indexOf('@');
        String sub = mail.substring(ind + 1, mail.length());
        System.out.println("Extention : " + sub);
    }
}