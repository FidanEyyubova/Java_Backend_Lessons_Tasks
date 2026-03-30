package Java_Algorithms_Data_Structure;
import java.util.Scanner;

public class Task02EasyLinearSearch {
    public static void main (String[] args){
        int[] nums = {5,10,15,20,25,30,35,40,45,50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int goal = scanner.nextInt();
        int result = linearSearch(nums, goal);
        if (result != -1) {
            System.out.println("Found! İndex: " + result + ", Value: " + nums[result]);
        } else {
            System.out.println("Not found.");
        }
        scanner.close();

    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
