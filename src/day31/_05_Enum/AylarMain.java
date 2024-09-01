package day31._05_Enum;

public class AylarMain {
    public static void main(String[] args) {
        /*
         * Writing methods to:
         * - Find the number of days in a month.
         * - Get the month name in Turkish.
         * - Retrieve the month number.
         *
         * Java suggests that if you need constant values associated with each
         * enum element (e.g., for JANUARY -> January, 1, 31), and you want these
         * constant values to be part of the enum itself, there is a good solution for you.
         */

        Months month = Months.AUGUST;

        System.out.println(month.monthName);
        System.out.println(month.monthNo);
        System.out.println(month.daysCount);
    }
}
