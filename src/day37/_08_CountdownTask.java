package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _08_CountdownTask {
    public static void main(String[] args) throws InterruptedException {
        // Count down the current time, displaying it every second in reverse.

        // Get the current time once
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss"); // 24-hour format

        while (true) {
            System.out.print("\r" + currentTime.format(timeFormatter)); // Display the current time
            currentTime = currentTime.minusSeconds(1); // Subtract 1 second
            Thread.sleep(1000); // Pause for 1 second
        }
    }
}
