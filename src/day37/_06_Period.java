package day37;

import java.time.LocalDate;
import java.time.Period;

public class _06_Period {
    public static void main(String[] args) {
        // Period is used to represent the difference between two dates.
        // It is used specifically for LocalDate instances.

        LocalDate birthDate = LocalDate.of(1978, 10, 25); // Defining birth date
        LocalDate today = LocalDate.now(); // Current date

        Period age = Period.between(birthDate, today); // Calculating the period between two dates
        System.out.println("Years = " + age.getYears());
        System.out.println("Months = " + age.getMonths());
        System.out.println("Days = " + age.getDays());

        System.out.println("You are " + age.getYears() + " years old");

        System.out.println("****************************");

        // Defining periods of specific lengths
        Period periodOf3Days = Period.ofDays(3); // A period of 3 days
        Period periodOf3Months = Period.ofMonths(3); // A period of 3 months

        System.out.println("*****************************");

        // Course start and end date calculation
        LocalDate courseStartDate = LocalDate.of(2023, 11, 20); // Course start date
        Period courseDuration = Period.ofMonths(6); // Course duration of 6 months
        LocalDate courseEndDate = courseStartDate.plus(courseDuration); // Calculating course end date
        System.out.println("Course End Date = " + courseEndDate);
        System.out.println("Course End Day of Week = " + courseEndDate.getDayOfWeek());
    }
}
