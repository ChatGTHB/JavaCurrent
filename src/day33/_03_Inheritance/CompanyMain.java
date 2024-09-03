package day33._03_Inheritance;

public class CompanyMain {

    public static void main(String[] args) {
        Employee emp = new Employee("John", 10000, 2);
        System.out.println("emp = " + emp);

        GeneralManager gm = new GeneralManager("Michael", 10000, 2, 5000);
        System.out.println("gm = " + gm);
    }
}
