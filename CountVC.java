package Day9;

public class CountVC {
    public static void main(String[] args) {
    	int vow=0;
    	int con=0;
        String str = "HeLLo WoRLd From Java";
        String ref = "aeiouAEIOU";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ((Character.isLetter(ch))) {
                    if (ref.indexOf(str.charAt(i)) != -1)
                        vow++;
                    else
                        con++;
                }
            }
          
            
            System.out.println("Number of Vowels = " + vow+ "\nNumber of Consonants = "+ con);
    }
}
