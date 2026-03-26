package Java_CondState_Loops;

import java.util.Scanner;

public class Task07MediumMultiplicationGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int rowSum = 0;
            for (int j = 1; j <= N; j++) {
                int number = i * j;
                System.out.printf("%4d", number);
                rowSum += number;
            }
            System.out.print(" Row sum: " + rowSum);
            System.out.println();
        }

        scanner.close();
    }
}