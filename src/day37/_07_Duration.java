package day37;

import java.time.Duration;
import java.time.LocalTime;

public class _07_Duration {
    public static void main(String[] args) {
        // Duration: Used to calculate the difference between LocalTime and LocalDateTime objects
        long startTime = System.currentTimeMillis(); // Capture the current time in milliseconds

        // LocalTime examples
        LocalTime lessonStart = LocalTime.of(19, 0, 0); // Lesson start time: 7:00 PM
        LocalTime lessonEnd = LocalTime.of(21, 50, 5);  // Lesson end time: 9:50 PM

        // Calculate the duration between start and end times
        Duration lessonDuration = Duration.between(lessonStart, lessonEnd);
        System.out.println("Lesson Duration = " + lessonDuration);

        // Convert and display the total duration in various units
        System.out.println("Hours = " + lessonDuration.toHours()); // Total hours
        System.out.println("Minutes = " + lessonDuration.toMinutes()); // Total minutes
        System.out.println("Seconds = " + lessonDuration.getSeconds()); // Total seconds

        System.out.println("******* Code Performance Measurement *******");

        long endTime = System.currentTimeMillis(); // Capture the current time after execution
        System.out.println("Elapsed Time = " + (endTime - startTime) + " ms"); // Display the execution time in milliseconds
    }
}
