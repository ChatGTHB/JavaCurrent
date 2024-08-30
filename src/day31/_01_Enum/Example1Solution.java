package day31._01_Enum;

enum Months {
    UNDEFINED, JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Example1Solution {
    public static void main(String[] args) {
        Months month = Months.SEPTEMBER;  //int number = 5;

        switch (month) {
            case FEBRUARY:
                System.out.println(28);
                break;
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println(31);
                break;
            case APRIL:
            case JUNE:
            case NOVEMBER:
            case SEPTEMBER:
                System.out.println(30);
                break;
        }

        if (month == Months.JUNE) {
            System.out.println("apply raise");
        }

        System.out.println(month); // toString
        System.out.println("month.name() = " + month.name()); // Displays the symbolic name
        System.out.println("month.ordinal() = " + month.ordinal()); // Gives the index of the symbolic name

        for (Months m : Months.values())
            System.out.println(m.name() + " - " + m.ordinal());

    }

    // In programming languages, enum, enumeration, and enum constants
    // are used to define a variable that can only take one out of a small
    // set of possible values. These constants form a group, making the code
    // easier to manage, access, and understand.

    // Enums allow us to input a large amount of data at once in a batch,
    // making it easier to use and write in the future.
}
