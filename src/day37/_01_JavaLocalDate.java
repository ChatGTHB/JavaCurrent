package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate stores only the date information like day, month, and year
        LocalDate date = LocalDate.now();

        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth()); // returns the name of the month
        System.out.println("getMonth().getValue() = " + date.getMonth().getValue());// returns the month number
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth()); // which day of the month it is
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("getDayOfWeek().getValue() = " + date.getDayOfWeek().getValue());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());

        // built-in formats
        System.out.println("ISO_DATE = " + date.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // Displaying in custom formats
        System.out.println(" *********  Displaying in custom formats **********");
        DateTimeFormatter customFormat1 = DateTimeFormatter.ofPattern("dd/MM/YYYY"); // date pattern
        System.out.println("date dd/MM/YYYY = " + date.format(customFormat1));

        DateTimeFormatter customFormat2 = DateTimeFormatter.ofPattern("d.M.YY"); // date pattern
        System.out.println("date d.M.YY = " + date.format(customFormat2));

        DateTimeFormatter of3 = DateTimeFormatter.ofPattern("EEEE dd.MM.YYYY"); // date pattern
        System.out.println("date EEEE dd.MM.YYYY = " + date.format(of3));

        DateTimeFormatter of4 = DateTimeFormatter.ofPattern("EE dd.MM.YYYY"); // date pattern
        System.out.println("date EE dd.MM.YYYY = " + date.format(of4));

        DateTimeFormatter of5 = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.YYYY"); // date pattern
        System.out.println("date MMMM EEEE dd.MM.YYYY = " + date.format(of5));
    }
}
