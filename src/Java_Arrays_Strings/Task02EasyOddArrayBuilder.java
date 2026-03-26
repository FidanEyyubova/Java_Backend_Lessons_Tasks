package Java_Arrays_Strings;

import java.util.Arrays;

public class Task02EasyOddArrayBuilder {
    public static void main (String[] args){
        int[] oddNumbers = new int[50];
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = 2 * i + 1;
        }

        System.out.println("Full odd numbers: " + Arrays.toString(oddNumbers));
        System.out.println("First number: " + oddNumbers[0]);
        System.out.println("Last number: " + oddNumbers[49]);
    }
}
