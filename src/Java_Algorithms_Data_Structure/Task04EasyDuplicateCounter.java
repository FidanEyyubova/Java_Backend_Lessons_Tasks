package Java_Algorithms_Data_Structure;

public class Task04EasyDuplicateCounter {
    public static void main (String[] args){
        int[] numbers = {5, 8, 5, 12, 12, 12, 0, 20, 8, 4, 15, 5};
        int[] freq = new int[21];
        int duplicates = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            freq[value]++;
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j] > 0) {
                System.out.println("Number " + j + ": " + freq[j] + " time");
                if (freq[j] > 1) {
                    duplicates++;
                }
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
