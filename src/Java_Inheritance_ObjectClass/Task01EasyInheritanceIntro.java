package Java_Inheritance_ObjectClass;

class Person {
    String name;
    int age;

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String group;

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Group: " + group);
    }
}

public class Task01EasyInheritanceIntro {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Fidan";
        p.age = 21;
        p.printInfo();

        Student s = new Student();
        s.name = "Narmin";
        s.age = 20;
        s.group = "594A";
        s.printInfo();
    }
}
