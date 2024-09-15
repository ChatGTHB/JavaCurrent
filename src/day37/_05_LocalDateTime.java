package day37;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _05_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime stores both date and time information

        LocalDateTime currentDateTime = LocalDateTime.now(); // Getting current date and time
        System.out.println("Current DateTime = " + currentDateTime);

        // Accessing individual components of the date and time
        System.out.println("Year = " + currentDateTime.getYear());
        System.out.println("Hour = " + currentDateTime.getHour());
        System.out.println("Month = " + currentDateTime.getMonth());
        // You can retrieve other parts of the date and time as well

        // Defining a custom format for the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("Formatted DateTime = " + currentDateTime.format(formatter));
    }
}
