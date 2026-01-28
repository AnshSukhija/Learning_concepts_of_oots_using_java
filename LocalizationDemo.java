package Day8;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {

    private static void showMessages(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        System.out.println("Locale: " + locale);
        System.out.println("greeting   : " + bundle.getString("greeting"));
        System.out.println("ask.name   : " + bundle.getString("ask.name"));
        System.out.println("farewell   : " + bundle.getString("farewell"));
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // Example usage (not visible in image, but likely to be something like):
        // showMessages(Locale.ENGLISH);
        // showMessages(new Locale("es", "ES"));
    	// for single locale
    	/*Locale frenchLocale = new Locale("fr");
    	showMessages(frenchLocale);*/

    	// for all locale
    	
    	Locale[] testLocales = {
    	    Locale.ENGLISH,
    	    new Locale("fr"),
    	    new Locale("hi", "IN")
    	};

    	for (Locale loc : testLocales) {
    	    showMessages(loc);
    	}

    	
    }
}