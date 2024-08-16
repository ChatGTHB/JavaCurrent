package day30._04_FinalStatic;

import java.util.Scanner;

public class QuestionMain {
    public static void main(String[] args) {
//        Constants c = new Constants();
//        int a = c.HOURS_IN_A_DAY;

//        int b = Constants.HOURS_IN_A_DAY;

        int days;
        int hours;
        int minutes;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Days: ");
        days = scanner.nextInt();
        System.out.print("Hours: ");
        hours = scanner.nextInt();
        System.out.print("Minutes: ");
        minutes = scanner.nextInt();

        int totalSeconds = Constants.calculate(days, hours, minutes);
        System.out.println("Total seconds = " + totalSeconds);
    }
}
