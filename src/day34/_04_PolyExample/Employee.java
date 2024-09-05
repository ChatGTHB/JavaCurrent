package day34._04_PolyExample;

public class Employee extends Person {
    private String department;

    public Employee(String firstName, String lastName, String role, String department) {
        super(firstName, lastName, role);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
