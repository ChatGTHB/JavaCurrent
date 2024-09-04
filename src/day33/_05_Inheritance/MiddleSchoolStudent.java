package day33._05_Inheritance;

public class MiddleSchoolStudent extends Student {
    private String exam;

    public MiddleSchoolStudent(String name, StudentType type, String exam) {
        super(name, type);
        setExam(exam);
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return super.toString() + ", exam=" + this.exam;
    }
}
