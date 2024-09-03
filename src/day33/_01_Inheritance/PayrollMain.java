package day33._01_Inheritance;

public class PayrollMain {
    public static void main(String[] args) {
        ManagerNew mn = new ManagerNew();

        mn.setFirstName("Oguzhan");

        System.out.println("mn.getFirstName() = " + mn.getFirstName());
        // ...
        // Using all the properties and methods
        // from another class is called INHERITANCE.
    }
}
