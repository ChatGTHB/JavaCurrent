package day37;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _08_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now(); // parametre vermezsek lokal verir

        Set<String> zamanZoneIdleri = ZoneId.getAvailableZoneIds();

        for (String s : zamanZoneIdleri) {
            System.out.println(s);
        }

        ZoneId zoneIdAlmanya = ZoneId.of("Europe/Berlin");
        ZonedDateTime adt = ZonedDateTime.now(zoneIdAlmanya);
        System.out.println("adt = " + adt);
    }
}
