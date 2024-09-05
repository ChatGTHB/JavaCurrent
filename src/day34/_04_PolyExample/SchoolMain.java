package day34._04_PolyExample;

public class SchoolMain {
    public static void main(String[] args) {
        Person student1 = new Student("John", "Smith", "Student", "5A");
        Person employee1 = new Employee("Emma", "Johnson", "Software Engineer", "IT");

        // 1st Method
        student1.printID(student1);
        employee1.printID(employee1);

        // 2nd Method
        student1.printID2();
        employee1.printID2();
    }
}
