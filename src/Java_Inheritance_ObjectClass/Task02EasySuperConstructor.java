package Java_Inheritance_ObjectClass;

class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Model: " + model);
    }
}

public class Task02EasySuperConstructor {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2024, "Camry");
        myCar.displayInfo();
    }
}
