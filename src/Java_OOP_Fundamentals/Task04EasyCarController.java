package Java_OOP_Fundamentals;
public class Task04EasyCarController {

    static class Car {
        private final String brand;
        private int speed;
        private final int maxSpeed;

        public Car(String brand, int maxSpeed) {
            this.brand = brand;
            this.maxSpeed = maxSpeed;
            this.speed = 0;
        }

        public void accelerate(int delta) {
            System.out.println("Accelerating +" + delta + " km/h...");
            speed += delta;

            if (speed > maxSpeed) {
                speed = maxSpeed;
            }

            printCurrentSpeed();
        }

        public void brake(int delta) {
            System.out.println("Braking -" + delta + " km/h...");
            speed -= delta;
            if (speed < 0) {
                speed = 0;
            }
            printCurrentSpeed();
        }

        private void printCurrentSpeed() {
            System.out.println(brand + " current speed: " + speed + " km/h (Limit: " + maxSpeed + ")");
        }
    }

    public static void main(String[] args) {

        Car sportCar = new Car("BMW", 250);
        Car familyCar = new Car("Mercedes", 180);

        sportCar.accelerate(100);
        sportCar.accelerate(200);
        familyCar.accelerate(50);
        familyCar.brake(30);
        familyCar.brake(40);
    }
}
