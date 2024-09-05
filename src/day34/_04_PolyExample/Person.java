package day34._04_PolyExample;

public class Person {
    private String firstName;
    private String lastName;
    private String role;

    public Person(String firstName, String lastName, String role) {
        setFirstName(firstName);
        setLastName(lastName);
        setRole(role);
    }

    public void printID(Person incomingPerson) {
        System.out.println("\n\n*** ID Card ***");
        System.out.println("First Name = " + incomingPerson.firstName);
        System.out.println("Last Name = " + incomingPerson.lastName);
        System.out.println("Role = " + incomingPerson.role);

        if (incomingPerson instanceof Student)
            System.out.println("Class Section = " +
                    ((Student) incomingPerson).getClassSection());

        if (incomingPerson instanceof Employee)
            System.out.println("Department = " +
                    ((Employee) incomingPerson).getDepartment());
    }

    public void printID2() {
        System.out.println("\n\n*** ID Card ***");
        System.out.println("First Name = " + this.firstName);
        System.out.println("Last Name = " + this.lastName);
        System.out.println("Role = " + this.role);

        if (this instanceof Student)
            System.out.println("Class Section = " +
                    ((Student) this).getClassSection());

        if (this instanceof Employee)
            System.out.println("Department = " +
                    ((Employee) this).getDepartment());
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
