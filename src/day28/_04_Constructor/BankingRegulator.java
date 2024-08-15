package day28._04_Constructor;

public class BankingRegulator {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.name = "Ziraat Bank";
        bank1.establishmentYear = 1876;
        bank1.branchCount = 1500;

        Bank bank2 = new Bank("Garanti Bank");
        Bank bank3 = new Bank("Akbank", 600, 1980);

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
    }
}
