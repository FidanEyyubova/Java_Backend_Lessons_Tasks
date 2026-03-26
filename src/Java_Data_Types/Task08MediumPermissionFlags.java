package Java_Data_Types;

public class Task08MediumPermissionFlags {
    public static void main (String[] args){
        int READ = 1;
        int WRITE = 2;
        int EXPORT = 4;
        int AUDIT = 8;

        int first = READ | WRITE;
        System.out.println("First: " + first);

        boolean canRead = true;
        System.out.println("Read? " + canRead);

        first |= EXPORT;
        System.out.println("Export: " + first);

        first ^= WRITE;
        System.out.println("Delete: " + first);

        System.out.println("Final Decimal:"  + first);
        System.out.println("Final Binary: " + Integer.toBinaryString(first));
    }
}
