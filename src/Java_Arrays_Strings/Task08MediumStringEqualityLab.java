package Java_Arrays_Strings;

public class Task08MediumStringEqualityLab {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));

        String s5 = s3.intern();

        System.out.println("s1 == s5: " + (s1 == s5));
        System.out.println("s3 == s5: " + (s3 == s5));
    }
}
