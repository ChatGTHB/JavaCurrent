package day33._05_Inheritance;

public class Student {
    private final int id; // cannot be changed after initialization
    private String name;
    private StudentType type;

    private static int counter = 1;

    public Student(String name, StudentType type) {
        setName(name);
        setType(type);
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student : " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type;
    }
}
