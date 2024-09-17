package day37;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _09_ZonedDateTime {
    public static void main(String[] args) {
        // ZonedDateTime gives the current date and time with the time zone.
        ZonedDateTime localZonedDateTime = ZonedDateTime.now(); // If no parameter is given, it returns the local date and time.

        // Get all available time zone IDs
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        // Print all available zone IDs
        for (String zoneId : availableZoneIds) {
            System.out.println(zoneId);
        }

        // Example: Get current time in a specific zone (Germany, Europe/Berlin)
        ZoneId zoneIdGermany = ZoneId.of("Europe/Berlin");
        ZonedDateTime germanyZonedDateTime = ZonedDateTime.now(zoneIdGermany);
        System.out.println("Germany ZonedDateTime = " + germanyZonedDateTime);
    }
}
