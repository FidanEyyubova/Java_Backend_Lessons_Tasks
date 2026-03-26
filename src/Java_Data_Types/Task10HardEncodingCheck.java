package Java_Data_Types;

import java.nio.charset.StandardCharsets;

public class Task10HardEncodingCheck {
    public static void main (String[] args){
        String text = "Mortal Kombat 🎮";
        byte[] utf8 = text.getBytes(StandardCharsets.UTF_8);

        System.out.println("Length: " + text.length());
        System.out.println("Number Count: " + text.codePointCount(0, text.length()));
        System.out.println("UTF-8: " + utf8.length + " byte");

        char alphabet = text.charAt(2);
        System.out.println(alphabet + (int) alphabet);
    }
}
