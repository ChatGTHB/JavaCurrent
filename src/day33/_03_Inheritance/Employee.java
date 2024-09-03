package day33._03_Inheritance;

public class Employee {
    private String name;
    private double baseSalary;
    private int salaryMultiplier;

    public Employee(String name, double baseSalary, int salaryMultiplier) {
        setName(name);
        setBaseSalary(baseSalary);
        setSalaryMultiplier(salaryMultiplier);
    }

    public double calculateSalary() {
        return this.baseSalary * this.salaryMultiplier;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", baseSalary=" + this.baseSalary +
                ", salaryMultiplier=" + this.salaryMultiplier +
                ", Net Salary=" + calculateSalary() +
                '}';
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalaryMultiplier() {
        return salaryMultiplier;
    }

    public void setSalaryMultiplier(int salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }
}
