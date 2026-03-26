package Java_CondState_Loops;

import java.util.Scanner;

public class Task05MediumATMDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int accountBalance = scanner.nextInt();

        System.out.print("Enter withdraw amount: ");
        int withdrawalAmount = scanner.nextInt();

        if (accountBalance <= 0) {
            System.out.println("There is no money in your account!");
        } else if (withdrawalAmount <= 0) {
            System.out.println("Wrong withdraw amount!");
        } else if (withdrawalAmount > accountBalance) {
            System.out.println("Insufficient funds!");
        } else if (withdrawalAmount >= 500) {
            System.out.println("OTP is required!");


            final int OTP = 123456;
            System.out.print("Enter OTP: ");
            int enteredOtp = scanner.nextInt();

            if (enteredOtp == OTP) {
                accountBalance -= withdrawalAmount;
                System.out.println("OTP verified. Success! Your final account balance: " + accountBalance);
            } else {
                System.out.println("Wrong OTP! Transaction canceled.");
            }

        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Success! Your final account balance: " + accountBalance);
        }

        scanner.close();
    }
}