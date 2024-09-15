package day37;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_LocalDate {
    public static void main(String[] args) {
        // LocalDate stores only the date information like day, month, and year
        LocalDate date = LocalDate.now();

        // Custom date formatter pattern
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("date = " + date.format(customFormatter));

        System.out.println("*** Display in another language ***");
        // Displaying the date in German
        System.out.println("German date=" + date.format(customFormatter.withLocale(Locale.GERMANY)));

        // Explaining Localization
        // en-US : English as spoken in the USA
        // en-UK : English as spoken in the UK
        // fr-CA : French as spoken in Canada
        // en-CA : English as spoken in Canada
        // tr-TR : Turkish as spoken in Turkey
        // zh-CH : Chinese as spoken in China

        Locale chineseLocale = new Locale("zh", "CH"); // language, country
        System.out.println("Chinese date=" + date.format(customFormatter.withLocale(chineseLocale)));

        // Listing all available locales
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.print("Language=" + locale.getDisplayLanguage());
            System.out.print(",Country=" + locale.getDisplayCountry());
            System.out.print(",Language code=" + locale.getLanguage());
            System.out.println(",Country code=" + locale.getCountry());
        }

        System.out.println("*************");
        // Example of setting a specific date
        LocalDate specificDate1 = LocalDate.of(2053, 5, 20);
        LocalDate specificDate2 = LocalDate.of(2053, Month.MAY, 20);
        System.out.println("specificDate2 formatted = " + specificDate2.format(customFormatter));
    }
}
