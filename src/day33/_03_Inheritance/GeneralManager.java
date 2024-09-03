package day33._03_Inheritance;

public class GeneralManager extends Employee {
    private double compensation;

    public GeneralManager(String name, double baseSalary, int salaryMultiplier, double compensation) {
        super(name, baseSalary, salaryMultiplier);
        setCompensation(compensation);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.compensation;
    }

    public double getCompensation() {
        return this.compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    @Override
    public String toString() {
        return super.toString() + ", compensation= " + this.compensation;
    }
}
