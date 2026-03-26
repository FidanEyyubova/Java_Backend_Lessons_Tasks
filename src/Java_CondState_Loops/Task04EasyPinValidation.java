package Java_CondState_Loops;

import java.util.Scanner;
public class Task04EasyPinValidation {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        final int PIN = 1259;
        int field;
        int attempts = 0;

        do {
            System.out.print("Enter the PIN: ");
            field = scanner.nextInt();
            attempts++;

            if (field == PIN){
                System.out.println("PIN accepted. Access granted!");
                break;
            }else {
                System.out.println("Incorrect PIN.");
            }

        }while (attempts < 3);

        if (field != PIN){
            System.out.println("Maximum attempts exceeded. Account locked.");
        }

        scanner.close();
    }
}
