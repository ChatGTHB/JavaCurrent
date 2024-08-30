package day31._02_Enum;

public class Example1SeparateFile {
    public static void main(String[] args) {
        Months month = Months.SEPTEMBER;

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
    }
}
