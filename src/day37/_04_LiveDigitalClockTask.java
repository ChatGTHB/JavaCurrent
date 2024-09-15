package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_LiveDigitalClockTask {

    // Create a live digital clock
    // The time will update every second, showing progression like 21:32:45 to 21:32:46, 21:32:47, and so on.
    // It will overwrite the previous time in the console.

    // Thread.sleep(1000); pauses the execution for 1 second

    public static void main(String[] args) throws InterruptedException {
        // Setting up the time formatter to display hours, minutes, and seconds in a 24-hour format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {
            LocalTime currentTime = LocalTime.now(); // Get the current system time
            System.out.print("\r" + currentTime.format(formatter)); // Print the formatted time

            Thread.sleep(1000); // Pause for 1 second before updating the time
        }
    }
}
