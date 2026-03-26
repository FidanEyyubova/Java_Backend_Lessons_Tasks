package Java_CondState_Loops;

import java.util.Scanner;
public class Task01EasyAgeClassifier {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
       int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid Input");
        }else if (age<=12) {
            System.out.println("child");
        } else if (age >12 && age<=17) {
            System.out.println("teen");
        } else if (age > 17 && age<=64) {
            System.out.println("adult");
        } else {
            System.out.println("senior");
        }
        scanner.close();
    }

}
