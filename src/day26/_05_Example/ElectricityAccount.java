package day26._05_Example;

public class ElectricityAccount {
    // Attributes, properties, fields
    int totalConsumption = 0;
    double unitPrice = 20;

    // Method to add consumption
    void addConsumption(int monthlyConsumption) {
        this.totalConsumption += monthlyConsumption;
        // this.totalConsumption = this.totalConsumption + monthlyConsumption;
    }

    // Method to print the bill
    void printBill(String name) {
        double totalAmount = this.totalConsumption * this.unitPrice;
        System.out.println("*********************");
        System.out.println("     Your Bill");
        System.out.println("*********************");
        System.out.println("Customer = " + name);
        System.out.println("Total Consumption = " + this.totalConsumption);
        System.out.println("Total Amount      = " + totalAmount);
        System.out.println("*********************");
    }
}
