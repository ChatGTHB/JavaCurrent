package day37;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_LocalTime {
    public static void main(String[] args) {
        // LocalTime only stores time information like hour, minute, second, and nanosecond.

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        // Retrieving individual components of the time
        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());
        System.out.println("time.getSecond() = " + time.getSecond());
        System.out.println("time.getNano() = " + time.getNano());

        // Custom formatting
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("time hh:mm:ss = " + time.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("time kk:mm = " + time.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("time hh:mm:ss a = " + time.format(format3));

        // Directly setting a specific time value
        LocalTime specificTime = LocalTime.of(17, 34, 45);
        System.out.println("specificTime = " + specificTime.format(format3));
    }
}
