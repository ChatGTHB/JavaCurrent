package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _14_PaymentInstallmentPlan {
    public static void main(String[] args) {

        // TODO 3: Plan the installments for a user-provided total amount and start date.
        // Steps:
        // 1. Ask the user for a start date, the total amount, and the number of installments.
        // 2. Calculate the installment amount.
        // 3. Display the payment schedule including the installment number, date, and amount.

        // Example Output:
        // Installment 1 - Date: 25.01.2023 - Amount: 500.00
        // Installment 2 - Date: 25.02.2023 - Amount: 500.00
        // ...

        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a start date, total amount, and number of installments
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Enter the start date (dd.MM.yyyy): ");
        String startDateStr = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateStr, dateFormatter);

        System.out.print("Enter the total amount: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Enter the number of installments: ");
        int numberOfInstallments = scanner.nextInt();

        // Calculate the installment amount
        double installmentAmount = totalAmount / numberOfInstallments;

        // Print the installment plan
        System.out.println("\nPayment Installment Plan:");
        for (int i = 1; i <= numberOfInstallments; i++) {
            LocalDate installmentDate = startDate.plusMonths(i - 1); // Increment by 1 month for each installment
            System.out.printf("Installment %d - Date: %s - Amount: %.2f\n",
                    i, installmentDate.format(dateFormatter), installmentAmount);
        }
    }
}
