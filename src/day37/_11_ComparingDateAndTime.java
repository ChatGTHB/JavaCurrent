package day37;

import java.time.LocalDate;

public class _11_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Get today's date
        LocalDate yesterday = today.minusDays(1); // Get yesterday's date by subtracting one day

        // Check if today is after yesterday
        boolean isAfter = today.isAfter(yesterday);
        System.out.println("Is today after yesterday? = " + isAfter);

        // Check if today is before yesterday
        boolean isBefore = today.isBefore(yesterday);
        System.out.println("Is today before yesterday? = " + isBefore);

        // Check if today is equal to yesterday
        boolean isEqual = today.isEqual(yesterday);
        System.out.println("Is today equal to yesterday? = " + isEqual);

        // Check if the current year is a leap year
        boolean isLeapYear = today.isLeapYear();
        System.out.println("Is it a leap year? = " + isLeapYear);
    }
}
