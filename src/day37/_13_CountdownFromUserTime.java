package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _13_CountdownFromUserTime {
    public static void main(String[] args) throws InterruptedException {

        // TODO 2: Create a countdown timer based on user input time, decrementing the time every second.

        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a time in the format HH:mm:ss
        System.out.print("Enter a time (e.g., 14:30:00): ");
        String userInput = scanner.nextLine();

        // Parse the user input to a LocalTime object
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime userTime = LocalTime.parse(userInput, timeFormatter);

        // Infinite loop for countdown
        while (true) {
            // Display the user-provided time, formatted as HH:mm:ss
            System.out.print("\r" + userTime.format(timeFormatter));

            // Decrement the time by 1 second
            userTime = userTime.minusSeconds(1);

            // Pause for 1 second before updating the time
            Thread.sleep(1000);
        }
    }
}
