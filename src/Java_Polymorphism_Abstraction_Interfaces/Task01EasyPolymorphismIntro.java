package Java_Polymorphism_Abstraction_Interfaces;

public class Task01EasyPolymorphismIntro {

    static class Animal {
        void speak() {
            System.out.println("Animal speaks");
        }
    }

    static class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal a : animals) {
            a.speak();
        }
    }
}