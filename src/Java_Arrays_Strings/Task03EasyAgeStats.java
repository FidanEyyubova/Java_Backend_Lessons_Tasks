package Java_Arrays_Strings;

public class Task03EasyAgeStats {
    public static void main (String[] args){
        int[] ages = {13,89,65,12,43,21,55,72};

        System.out.println("Sum: " + calculateSum(ages));
        System.out.println("Average: " + calculateAverage(ages));
        System.out.println("Max: " + findMin(ages));
        System.out.println("Min: " + findMax(ages));
    }

    private static int calculateSum(int[] ages) {
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        return  sum;
    }

    private static int calculateAverage(int[] ages) {
        return calculateSum(ages) / ages.length;
    }

    private static int findMax(int[] ages) {
        int max = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < max){
                max = ages[i];
            }
        }
        return max;
    }

    private static int findMin(int[] ages) {
        int min = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > min) {
                min = ages[i];
            }
        }
        return min;
    }

}
