package day26._05_Example;

public class EnerjiSA {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "John";
        // customer1 : object,
        // Customer  : Type, class

        customer1.electricityAccount.addConsumption(100); // January
        customer1.electricityAccount.addConsumption(200); // February
        customer1.electricityAccount.addConsumption(220); // March

        System.out.println("Total Consumption = " + customer1.electricityAccount.totalConsumption);
        customer1.electricityAccount.printBill(customer1.name);
    }
}
