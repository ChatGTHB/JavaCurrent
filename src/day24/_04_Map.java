package day24;

import java.util.HashMap;

public class _04_Map {
    public static void main(String[] args) {
        // Create a business card application for 2 people
        // name, email, phone, address

        // Creating a HashMap for Zehra's business card
        HashMap<String, String> zehraBusinessCard = new HashMap<>();
        zehraBusinessCard.put("name", "Zehra");
        zehraBusinessCard.put("email", "zehra@gmail.com");
        zehraBusinessCard.put("phone", "0505676767");
        zehraBusinessCard.put("address", "Çekmeköy");

        // Printing specific details from Zehra's business card
        System.out.println("zehraBusinessCard.get(name) = " + zehraBusinessCard.get("name"));
        System.out.println("zehraBusinessCard.get(email) = " + zehraBusinessCard.get("email"));

        // Creating a HashMap for Esma's business card
        HashMap<String, String> esmaBusinessCard = new HashMap<>();
        esmaBusinessCard.put("name", "Esma");
        esmaBusinessCard.put("email", "esma@gmail.com");
        esmaBusinessCard.put("phone", "0506878787");
        esmaBusinessCard.put("address", "Başakşehir");

        // Printing specific details from Esma's business card
        System.out.println("esmaBusinessCard.get(name) = " + esmaBusinessCard.get("name"));
        System.out.println("esmaBusinessCard.get(email) = " + esmaBusinessCard.get("email"));

        // Creating a HashMap to store multiple business cards
        HashMap<String, HashMap<String, String>> businessCards = new HashMap<>();
        businessCards.put("Zehra", zehraBusinessCard);
        businessCards.put("Esma", esmaBusinessCard);

        // Accessing and printing details from the nested HashMaps
        System.out.println("Zehra's email = " + businessCards.get("Zehra").get("email"));
        System.out.println("Zehra's phone = " + businessCards.get("Zehra").get("phone"));

        System.out.println("Esma's email = " + businessCards.get("Esma").get("email"));
        System.out.println("Esma's phone = " + businessCards.get("Esma").get("phone"));
    }
}
