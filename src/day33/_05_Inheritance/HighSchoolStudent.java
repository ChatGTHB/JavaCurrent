package day33._05_Inheritance;

public class HighSchoolStudent extends Student {
    private String major;

    public HighSchoolStudent(String name, StudentType type, String major) {
        super(name, type);
        setMajor(major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", major=" + this.major;
    }
}
