package day37;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _10_StringToLocalDateAndTimeParse {
    public static void main(String[] args) throws InterruptedException {
        // Converting user input (string) of time or date into actual LocalDate or LocalTime objects.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (e.g., 25.01.2023): ");
        String strDate = scanner.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(strDate, dateFormatter);

        System.out.println("Formatted date = " + date.format(dateFormatter));

        // TODO 1: Create a countdown timer from the current time, decrementing the time every second.

        // TODO 2: Create a countdown timer based on user input time, decrementing the time every second.

        // TODO 3: Plan the installments for a user-provided total amount and start date.
        // Steps:
        // 1. Ask the user for a start date, the total amount, and the number of installments.
        // 2. Calculate the installment amount.
        // 3. Display the payment schedule including the installment number, date, and amount.

        // Example Output:
        // Installment 1 - Date: 25.01.2023 - Amount: 500.00
        // Installment 2 - Date: 25.02.2023 - Amount: 500.00
        // ...
    }
}
