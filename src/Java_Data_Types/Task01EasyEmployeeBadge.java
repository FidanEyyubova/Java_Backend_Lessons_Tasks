package Java_Data_Types;

public class Task01EasyEmployeeBadge {
    public static void main (String[] args){
        String name = "Fidan";
        int age = 21;
        String department = "IT";
        int yearAtCompany = 3;
        boolean activeStatus = true;
        double hourlyRate = 8.5;

        final String COMPANY_NAME = "IT solutions";
        hourlyRate += 2.5;

        System.out.printf(
                "Employee: %s | Age: %d | Department: %s | Years: %d | Active: %b | Rate: $%.2f | Company: %s%n",
                name, age, department, yearAtCompany, activeStatus, hourlyRate, COMPANY_NAME
        );


    }
}
