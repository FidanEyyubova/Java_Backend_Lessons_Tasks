package Java_CondState_Loops;

import java.util.Scanner;

public class Task09HardNumberAnalytics {

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int sum = 0;
    static int positiveCount = 0;
    static int negativeCount = 0;
    static int zeroCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No data to analyze.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int current = sc.nextInt();

            processNumber(current);
        }

        printSummary(n);
        sc.close();
    }

    public static void processNumber(int num) {
        sum += num;
        updateMin(num);
        updateMax(num);
        updateCounts(num);
    }

    public static void updateMin(int num) {
        if (num < min) min = num;
    }

    public static void updateMax(int num) {
        if (num > max) max = num;
    }

    public static void updateCounts(int num) {
        if (num > 0) positiveCount++;
        else if (num < 0) negativeCount++;
        else zeroCount++;
    }

    public static void printSummary(int n) {
        double average = (double) sum / n;
        System.out.println("Total Sum: " + sum);
        System.out.println("Average:   " + average);
        System.out.println("Minimum:   " + min);
        System.out.println("Maximum:   " + max);
        System.out.println("Positives: " + positiveCount);
        System.out.println("Negatives: " + negativeCount);
        System.out.println("Zeros:     " + zeroCount);
    }
}
