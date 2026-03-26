package Java_CondState_Loops;

import java.util.Scanner;
public class Task03EasyRangePrinter {
    public static void main (String args[]){
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        if (start > end) {
            start = end;
        }
        int sum = 0;
        System.out.println("\nNumbers in range:");


        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum += i;

            if (i % 3 == 0) {
                System.out.println("divise by 3");
            }
        }

        System.out.println("\nTotal sum: " + sum);

       scanner.close();
    }
}
