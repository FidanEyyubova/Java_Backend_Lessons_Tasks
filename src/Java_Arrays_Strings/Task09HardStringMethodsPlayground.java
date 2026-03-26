package Java_Arrays_Strings;

public class Task09HardStringMethodsPlayground {
    public static void main(String[] args) {
        String text = "  Java,Arrays,Strings  ";

        System.out.println("Original: [" + text + "]");
        System.out.println("Length: " + text.length());

        int i = 5;
        if (i >= 0 && i < text.length()) {
            System.out.println("Character at " + i + ": " + text.charAt(i));
        }

        System.out.println("Index of 'Arrays': " + text.indexOf("Arrays"));

        String trimmed = text.trim();
        System.out.println("Trimmed: [" + trimmed + "]");

        System.out.println("Substring: " + trimmed.substring(0, 4));
        System.out.println("Upper: " + trimmed.toUpperCase());
        System.out.println("Lower: " + trimmed.toLowerCase());

        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'Strings': " + trimmed.endsWith("Strings"));
        System.out.println("Contains 'Arrays': " + trimmed.contains("Arrays"));

        System.out.println("Replace: " + trimmed.replace(",", "-"));
        System.out.println("Is Empty: " + "".isEmpty());
        System.out.println("Is Blank: " + "   ".isBlank());
        System.out.println("Strip: [" + text.strip() + "]");
    }
}
