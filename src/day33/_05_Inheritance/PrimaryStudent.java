package day33._05_Inheritance;

public class PrimaryStudent extends Student {
    private String club;

    public PrimaryStudent(String name, StudentType type, String club) {
        super(name, type);
        setClub(club);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return super.toString() + ", club=" + this.club;
    }
}
