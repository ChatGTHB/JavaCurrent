package day30._02_FinalVariables._02_Example;

public class RegistryOffice {
    public static void main(String[] args) {
        Citizen citizen1 = new Citizen("John", "Maple Street");
        Citizen citizen2 = new Citizen("Jane", "Oak Avenue");
        Citizen citizen3 = new Citizen("Emily", "Pine Road");

        System.out.println("citizen1 = " + citizen1);
        System.out.println("citizen2 = " + citizen2);
        System.out.println("citizen3 = " + citizen3);

        // citizen1.idNumber = 45; // Final variables can only be assigned a value
        // when defined or in the constructor.
    }
}
