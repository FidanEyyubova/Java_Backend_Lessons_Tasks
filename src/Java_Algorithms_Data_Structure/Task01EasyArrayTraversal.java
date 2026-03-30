package Java_Algorithms_Data_Structure;

public class Task01EasyArrayTraversal {
    public static void main (String[] args){
        int[] numbers = {12,45,67,23,41,11,89,1,50,22,87,90};
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
//FOR
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
//FOREACH
        for (int number : numbers) {
            System.out.println(number + "");
            sum += number;
            if (number % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Total Sum: " + sum);
        System.out.println("Count of Even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);
    }
}
