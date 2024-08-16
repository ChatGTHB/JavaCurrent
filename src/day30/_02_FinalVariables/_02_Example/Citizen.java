package day30._02_FinalVariables._02_Example;

public class Citizen {
    String name;
    String address;
    final int idNumber; // TCNo is translated as idNumber
    private static int idCounter = 1;

    public Citizen(String name, String address) {
        this.name = name;
        this.address = address;
        this.idNumber = idCounter++;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
