package day30._01_StaticVariables._02_Example;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John Smith");
        Student s2 = new Student(2, "Michael Brown");
        Student s3 = new Student(3, "Emily Johnson");
        Student s4 = new Student(6, "Sarah Williams");
        // Problem: I have to manually track the ID,
        // and there's a high chance of errors. The real solution is below.

        Student s11 = new Student("John Smith");
        Student s12 = new Student("Michael Brown");
        Student s13 = new Student("Emily Johnson");
        Student s14 = new Student("Sarah Williams");

        System.out.println(s11); // 1
        System.out.println(s12); // 2
        System.out.println(s13); // 3
        System.out.println(s14); // 4
    }
}
