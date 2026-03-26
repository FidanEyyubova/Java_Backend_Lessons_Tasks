package Java_Arrays_Strings;
import java.util.Scanner;

public class Task11HardUsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        validateUsername(username);

        sc.close();
    }

    public static void validateUsername(String user) {
        boolean isValid = true;

        if (user.length() < 6 || user.length() > 20) {
            System.out.println("Invalid length.");
            isValid = false;
        }

        if (user.isEmpty() || !Character.isLetter(user.charAt(0))) {
            System.out.println("Must start with a letter.");
            isValid = false;
        }

        if (user.contains(" ")) {
            System.out.println("Spaces are not allowed.");
            isValid = false;
        }

        boolean illegalCharFound = false;
        for (int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                illegalCharFound = true;
                break;
            }
        }

        if (illegalCharFound) {
            System.out.println("Contains illegal characters.");
            isValid = false;
        }

        System.out.println("FINAL RESULT: " + (isValid ? "VALID" : "INVALID"));
    }
}
