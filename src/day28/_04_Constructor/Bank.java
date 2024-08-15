package day28._04_Constructor;

public class Bank {
    String name;
    int branchCount;
    int establishmentYear;

    // Default constructor
    public Bank() {
    }

    // Constructor with only the name
    public Bank(String name) {
        this.name = name;
    }

    // Constructor with all fields
    public Bank(String name, int branchCount, int establishmentYear) {
        this.name = name;
        this.branchCount = branchCount;
        this.establishmentYear = establishmentYear;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branchCount=" + branchCount +
                ", establishmentYear=" + establishmentYear +
                '}';
    }
}
