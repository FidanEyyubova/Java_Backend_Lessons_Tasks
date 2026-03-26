package Java_Arrays_Strings;

import java.util.Scanner;

public class Task06MediumSeatFinder {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seat Code: ");
        String search = scanner.nextLine();
        boolean seatFound = false;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].equalsIgnoreCase(search)) {
                    System.out.println("Seat found!");
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    seatFound = true;
                    break;
                }
            }
            if (seatFound) break;
        }
        if (seatFound == false) {
            System.out.println("Seat not found: " + search);
        }

        scanner.close();
    }
}