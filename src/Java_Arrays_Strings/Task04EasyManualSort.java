package Java_Arrays_Strings;

import java.util.Arrays;

public class Task04EasyManualSort {
    public static void main(String[] args) {
        int[] original = {45, 12, 85, 32, 7, 60, 21, 99};
        int[] copy = original.clone();
        bubbleSort(copy);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}