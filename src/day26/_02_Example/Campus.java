package day26._02_Example;

public class Campus {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.schoolNumber = 1001;
        student1.name = "John";
        student1.surname = "Doe";
        student1.school.schoolName = "Sunshine High School";
        student1.school.principalName = "Jane Smith";
        student1.school.address = "Downtown";

        Student student2 = new Student();
        student2.schoolNumber = 1002;
        student2.name = "Alice";
        student2.surname = "Johnson";

        student2.school = new School(); // either define here or in the declaration
        student2.school.schoolName = "Liberty High School";
        student2.school.principalName = "Michael Brown";
        student2.school.address = "Uptown";

        System.out.println(student1.name);
        System.out.println(student1.school.schoolName);
    }
}
