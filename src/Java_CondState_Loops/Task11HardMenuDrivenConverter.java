package Java_CondState_Loops;

import java.util.Scanner;

public class Task11HardMenuDrivenConverter {

    private static final double AZN_TO_USD = 0.59;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    handleTemperature(sc);
                    break;
                case 2:
                    handleDistance(sc);
                    break;
                case 3:
                    handleCurrency(sc);
                    break;
                case 0:
                    System.out.println("Exiting... Have a great day!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    public static void printMenu() {
        System.out.println("\n--- Multi-Converter Menu ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Kilometer to Mile");
        System.out.println("3. Manat (AZN) to USD");
        System.out.println("0. Exit");
    }

    public static void handleTemperature(Scanner sc) {
        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Result: " + (celsius * 9 / 5 + 32) + " °F");
    }

    public static void handleDistance(Scanner sc) {
        System.out.print("Enter Kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Result: " + (km * 0.621371) + " Miles");
    }

    public static void handleCurrency(Scanner sc) {
        System.out.print("Enter Manat amount: ");
        double azn = sc.nextDouble();
        System.out.println("Result: $" + (azn * AZN_TO_USD));
    }
}