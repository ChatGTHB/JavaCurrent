package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Task {

    // Create a live digital clock
    // The time will update every second, showing progression from 21:32:45 to 21:32:46 to 21:32:47... and so on.
    // It will overwrite at the same place on the console.

    // Thread.sleep(1000); This command pauses the execution for 1 second

    public static void main(String[] args) throws InterruptedException {
        // Setting up the time formatter to display hours, minutes, and seconds
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {
            LocalTime time = LocalTime.now(); // Get the current system time
            System.out.print("\r" + time.format(formatter)); // Print the time in the specified format

            Thread.sleep(1000); // Pause for 1 second before updating the time
        }
    }
}
