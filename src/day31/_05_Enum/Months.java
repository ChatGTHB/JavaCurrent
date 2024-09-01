package day31._05_Enum;

public enum Months {
    JANUARY(1, 31, "January"),
    FEBRUARY(2, 28, "February"),
    MARCH(3, 31, "March"),
    APRIL(4, 30, "April"),
    MAY(5, 31, "May"),
    JUNE(6, 30, "June"),
    JULY(7, 31, "July"),
    AUGUST(8, 31, "August"),
    SEPTEMBER(9, 30, "September"),
    OCTOBER(10, 31, "October"),
    NOVEMBER(11, 30, "November"),
    DECEMBER(12, 31, "December");

    final int monthNo;
    final int daysCount;
    final String monthName;

    Months(int monthNo, int daysCount, String monthName) {
        this.monthNo = monthNo;
        this.daysCount = daysCount;
        this.monthName = monthName;
    }
}
