package Java_Arrays_Strings;
import java.util.Scanner;

public class Task12HardStudentAnalyticsConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Alice", "Bob", "Charlie"};
        int[][] grades = {
                {85, 90, 80},
                {95, 88, 92},
                {70, 60, 75}
        };

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n1. All Averages\n2. Top Student\n3. Search Name\n0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                showAll(names, grades);
            } else if (choice == 2) {
                showTop(names, grades);
            } else if (choice == 3) {
                search(sc, names, grades);
            }
        }
        sc.close();
    }

    public static void showAll(String[] names, int[][] grades) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + getAvg(grades[i]));
        }
    }

    public static void showTop(String[] names, int[][] grades) {
        int topIdx = 0;
        double best = 0;
        for (int i = 0; i < names.length; i++) {
            double current = getAvg(grades[i]);
            if (current > best) {
                best = current;
                topIdx = i;
            }
        }
        System.out.println("Top: " + names[topIdx] + " (" + best + ")");
    }

    public static void search(Scanner sc, String[] names, int[][] grades) {
        System.out.print("Name: ");
        String find = sc.next();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(find)) {
                System.out.println("Average: " + getAvg(grades[i]));
                return;
            }
        }
        System.out.println("Not found.");
    }

    public static double getAvg(int[] row) {
        int sum = 0;
        for (int g : row) sum += g;
        return (double) sum / row.length;
    }
}
