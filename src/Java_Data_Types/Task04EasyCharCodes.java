package Java_Data_Types;

public class Task04EasyCharCodes {
    public static void main (String[] args){
        char firstChar = 'A';
        char secondChar = 'B';
        char thirdChar = 'C';
        char fourthChar = 'D';
        String emojiWithWord = "Universe🪐";

        System.out.println(firstChar + ":" + (int)firstChar);
        System.out.println(secondChar + ":" + (int)secondChar);
        System.out.println(thirdChar + ":" + (int)thirdChar);
        System.out.println(fourthChar + ":" + (int)fourthChar);

        System.out.println("Emoji Word Length: " + emojiWithWord.length());
        System.out.println("Code Point Count: " + emojiWithWord.codePointCount(0,7));
    }
}
