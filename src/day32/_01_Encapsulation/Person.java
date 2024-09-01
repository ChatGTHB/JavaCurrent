package day32._01_Encapsulation;

public class Person {
    String firstName;
    String lastName;
    private int age;

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
