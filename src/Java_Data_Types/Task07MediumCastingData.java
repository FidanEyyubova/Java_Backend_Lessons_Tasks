package Java_Data_Types;

public class Task07MediumCastingData {
    public static void main (String[] args){
        double numberOne = 12.5;
        int numberTwo = 3;
        byte sensor1 = 50;
        byte sensor2 = 80;

        int totalSensor = sensor1 + sensor2;

        System.out.println("Casting: " + (byte)totalSensor);
        System.out.println("Casting: " + (int)numberOne);
        System.out.println("Casting: " + (byte)numberTwo);

    }
}
