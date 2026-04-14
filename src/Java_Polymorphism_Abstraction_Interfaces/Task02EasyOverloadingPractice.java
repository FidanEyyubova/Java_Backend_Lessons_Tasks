package Java_Polymorphism_Abstraction_Interfaces;

public class Task02EasyOverloadingPractice {

    static class Calculator {
        int sum(int a, int b) {
            return a + b;
        }

        double sum(double a, double b) {
            return a + b;
        }

        int sum(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two ints: " + calc.sum(5, 10));
        System.out.println("Sum of two doubles: " + calc.sum(5.5, 4.5));
        System.out.println("Sum of three ints: " + calc.sum(10, 20, 30));
    }
}
