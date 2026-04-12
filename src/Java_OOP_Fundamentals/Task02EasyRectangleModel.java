package Java_OOP_Fundamentals;
public class Task02EasyRectangleModel {

    static class Rectangle {
        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double area() {
            return width * height;
        }
        public double perimeter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);

        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());
        System.out.println();
    }
}
