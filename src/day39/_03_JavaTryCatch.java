package day39;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("The program has started");

        try {
            // This is where we try code that might throw an exception
            // Here we try to create an invalid date: February 30, 2024 (which doesn't exist)
            LocalDate date = LocalDate.of(2024, Month.FEBRUARY, 30);
        }
        // Catch block will handle the exception that occurs in the try block
        catch (Exception ex) {
            // This block will execute when an exception occurs
            System.out.println("Please try again.");
            System.out.println("Full error message: " + ex);
            System.out.println("Error description: " + ex.getMessage());
            // Logging: record this error somewhere for later debugging and improvement
            // Just like Windows collects error reports and sends them to Microsoft,
            // you can log errors for future improvements.
        }

        System.out.println("The program has ended");

        // An example of handling errors in learning and personal development
        try {
            // Keep working on Java and its tools
            // Continue learning and working hard
        }
        // When you face difficulty, don't give up. Handle the challenges and continue:
        catch (Exception ex) {
            // Understand the root cause of the problem
            // Focus more on the lessons
            // Watch necessary videos
            // Work in groups
            // Learn and continue without breaking down
            // Remember, you made a commitment to keep going, so keep pushing forward.
        }
        // In the end, a promising career is waiting for you!
    }
}
