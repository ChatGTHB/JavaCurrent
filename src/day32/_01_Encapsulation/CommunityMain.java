package day32._01_Encapsulation;

public class CommunityMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.firstName = "John";
        person1.lastName = "Doe";
        // person1.age = -40; // Direct access to age is restricted

        person1.setAge(40);

        // Encapsulation is the process of restricting direct access to variables
        // and using methods to protectively send and retrieve data.

        System.out.println(person1.getAge());
    }
}
