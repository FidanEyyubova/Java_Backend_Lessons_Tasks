package Java_Polymorphism_Abstraction_Interfaces;

public class Task04EasyAbstractShape {

    abstract static class Shape {
        String name;

        Shape(String name) {
            this.name = name;
        }

        abstract double area();

        void printName() {
            System.out.println("Shape: " + name);
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double width, height;

        Rectangle(String name, double width, double height) {
            super(name);
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle("My Circle", 5.0);
        Shape rect = new Rectangle("My Rectangle", 4.0, 6.0);

        circle.printName();
        System.out.println("Area: " + circle.area());

        System.out.println();

        rect.printName();
        System.out.println("Area: " + rect.area());
    }
}
