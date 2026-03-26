package Java_Data_Types;

public class Task06MediumWeekdayConsole {
    public static void main (String[] args){
        int packageCounter = Integer.MAX_VALUE - 2;

        for (int i = 1; i <= 3; i++) {
            packageCounter = packageCounter + 1;
            System.out.println(i + ": " + packageCounter);
        }
        packageCounter = Math.addExact(packageCounter, 1);
        System.out.println("Result: " + packageCounter);
    }
}
