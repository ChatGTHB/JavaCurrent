package day31._01_Enum;

public class Example1 {
    public static void main(String[] args) {
        // Given a month number, write a program that prints the number of days in the month

        int monthNo = 5; // May

        switch (monthNo) {
            case 2:
                System.out.println(28); // February
                break;
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                System.out.println(31);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                System.out.println(30);
                break;
        }

        if (monthNo == 6) { // June
            // apply raise
        }

        // Admin - the most authorized user, 0 - John teacher
        // Student - Martin, 1
        // Accountant - 2

//        if (userRole == 2){ // Accountant
//
//        }

        String monthName = "May";
        switch (monthName) {
            case "February":
                System.out.println(28);
                break;
            case "January":
            case "March":
            case "August":
            case "June":
            case "December":
                System.out.println(31);
                break;
            case "April":
            case "September":
            case "October":
            case "November":
                System.out.println(30);
                break;
        }
    }
}
