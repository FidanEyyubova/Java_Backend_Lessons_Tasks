package Java_Algorithms_Data_Structure;

public class Task03EasyMinMaxAndAverage {
    public static void main(String[] args) {
        int[] points = {83, 92, 78, 30, 95, 88, 72, 81, 14, 67, 89, 75};
        int maxPoint = findMax(points);
        int minPoint = findMin(points);
        double averagePoint = findAverage(points);
        System.out.printf("Min: %d, Max: %d, Average: %.2f%n", minPoint, maxPoint, averagePoint);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // DÜZƏLİŞ: max dəyişənini yeniləyirik
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}