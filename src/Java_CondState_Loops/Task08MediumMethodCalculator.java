package Java_CondState_Loops;

import java.util.Scanner;

public class Task08MediumMethodCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.print("\nEnter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            double result = calculate(num1, num2, op);
            printResult(result, op);

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (choice.equals("no")) {
                keepGoing = false;
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }

    public static double calculate(int a, int b, char op) {
        switch (op) {
            case '+': return add(a, b);
            case '-': return sub(a, b);
            case '*': return mul(a, b);
            case '/': return div(a, b);
            default:
                System.out.println("Error: Invalid Operator!");
                return Double.NaN;
        }
    }

    public static double add(int a, int b) { return a + b; }

    public static double sub(int a, int b) { return a - b; }

    public static double mul(int a, int b) { return a * b; }

    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static void printResult(double result, char op) {
        if (!Double.isNaN(result)) {
            System.out.println("The result of the " + op + " operation is: " + result);
        }
    }
}
