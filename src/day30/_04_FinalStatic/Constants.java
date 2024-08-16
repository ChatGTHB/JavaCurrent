package day30._04_FinalStatic;

public class Constants {
    static final int HOURS_IN_A_DAY = 24;
    static final int MINUTES_IN_AN_HOUR = 60;
    static final int SECONDS_IN_A_MINUTE = 60;

    public static int calculate(int days, int hours, int minutes) {
        int totalSeconds = days * Constants.HOURS_IN_A_DAY * Constants.MINUTES_IN_AN_HOUR * Constants.SECONDS_IN_A_MINUTE +
                hours * Constants.MINUTES_IN_AN_HOUR * Constants.SECONDS_IN_A_MINUTE +
                minutes * Constants.SECONDS_IN_A_MINUTE;

        return totalSeconds;
    }
}
