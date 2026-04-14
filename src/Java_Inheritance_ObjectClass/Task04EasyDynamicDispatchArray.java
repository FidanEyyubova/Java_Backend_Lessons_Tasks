package Java_Inheritance_ObjectClass;

public class Task04EasyDynamicDispatchArray {

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Animal()
        };

        for (Animal a : animals) {
            System.out.print(a.getClass().getSimpleName() + ": ");
            a.sound();
        }
    }
}