package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _12_ContinuousCountdown {
    public static void main(String[] args) throws InterruptedException {

        // TODO 1: Create a countdown timer from the current time, decrementing the time every second.

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Formatter to display time in HH:mm:ss format (without milliseconds)
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Infinite loop for countdown
        while (true) {
            // Print the current time in the desired format and overwrite the same line
            System.out.print("\r" + currentTime.format(timeFormatter));

            // Decrease the time by 1 second
            currentTime = currentTime.minusSeconds(1);

            // Pause for 1 second before the next iteration
            Thread.sleep(1000);
        }
    }
}
