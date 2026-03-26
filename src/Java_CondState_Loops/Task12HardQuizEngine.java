package Java_CondState_Loops;

import java.util.Scanner;
public class Task12HardQuizEngine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean restart = true;

        String[] questions = {
                "1. What is the capital of Azerbaijan?",
                "2. How many bits are in a byte?",
                "3. Which keyword is used to create a class in Java?",
                "4. What is 5 + 7?",
                "5. Is Java an object-oriented language? (yes/no)"
        };

        String[] answers = {"Baku", "8", "class", "12", "yes"};

        while (restart) {
            int score = 0;

            for (int i = 0; i < questions.length; i++) {
                String userAnswer = askQuestion(sc, questions[i]);
                if (isCorrectAnswer(userAnswer, answers[i])) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was: " + answers[i]);
                }
            }

            printFinalReport(score, questions.length);

            System.out.print("\nDo you want to try again? (yes/no): ");
            String choice = sc.next().toLowerCase();
            restart = choice.equals("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }

    public static String askQuestion(Scanner sc, String question) {
        System.out.println("\n" + question);
        System.out.print("Your answer: ");
        return sc.next();
    }

    public static boolean isCorrectAnswer(String userAns, String correctAns) {
        return userAns.equalsIgnoreCase(correctAns);
    }

    public static void printFinalReport(int score, int total) {
        char grade;
        if (score == 5) grade = 'A';
        else if (score == 4) grade = 'B';
        else if (score == 3) grade = 'C';
        else if (score == 2) grade = 'D';
        else grade = 'F';

        System.out.println("Score: " + score + "/" + total);
        System.out.println("Grade: " + grade);
    }
}
