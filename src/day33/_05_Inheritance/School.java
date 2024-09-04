package day33._05_Inheritance;

public class School {

    public static void main(String[] args) {

        PrimaryStudent sf = new PrimaryStudent("John", StudentType.PRIMARY, "Chess");
        MiddleSchoolStudent ms = new MiddleSchoolStudent("Michael", StudentType.MIDDLE, "LGS");
        HighSchoolStudent hs = new HighSchoolStudent("James", StudentType.HIGH, "Science");

        System.out.println("sf = " + sf);
        System.out.println("ms = " + ms);
        System.out.println("hs = " + hs);
    }
}
