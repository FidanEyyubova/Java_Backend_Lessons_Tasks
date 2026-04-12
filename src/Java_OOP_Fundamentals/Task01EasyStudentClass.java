package Java_OOP_Fundamentals;

public class Task01EasyStudentClass {
    static class Student {
        String name;
        int age;
        String group;

        public Student(String name, int age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Group: " + group);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Fidan", 21, "JT326");
        Student student2 = new Student("Arzu", 22, "JT327");
        student1.printInfo();
        student2.printInfo();
    }
}
