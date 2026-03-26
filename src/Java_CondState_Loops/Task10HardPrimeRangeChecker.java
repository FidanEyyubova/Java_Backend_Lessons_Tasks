package Java_CondState_Loops;

import java.util.Scanner;

public class Task10HardPrimeRangeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int primeCount = 0;
        System.out.println("\nPrimes between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }

        System.out.println("\n\nTotal primes found: " + primeCount);
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
