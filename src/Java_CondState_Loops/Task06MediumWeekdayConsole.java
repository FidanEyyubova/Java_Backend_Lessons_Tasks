package Java_CondState_Loops;

import java.util.Scanner;

public class Task06MediumWeekdayConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validEntries = 0;
        int numberOfDays;

        while (true) {
            System.out.print("Enter a day number (1-7): ");
            numberOfDays = scanner.nextInt();

            if (numberOfDays < 1 || numberOfDays > 7) {
                System.out.println("Invalid input, try again.");
                continue;
            }

            validEntries++;
            switch (numberOfDays) {
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
                case 7: System.out.println("Sunday"); break;
            }

            break;
        }

        System.out.println("Number of valid entries: " + validEntries);
        scanner.close();
    }
}