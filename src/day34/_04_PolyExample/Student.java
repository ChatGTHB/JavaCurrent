package day34._04_PolyExample;

public class Student extends Person {
    private String classSection;

    public Student(String firstName, String lastName, String role, String classSection) {
        super(firstName, lastName, role);
        setClassSection(classSection);
    }

    public String getClassSection() {
        return classSection;
    }

    public void setClassSection(String classSection) {
        this.classSection = classSection;
    }
}
