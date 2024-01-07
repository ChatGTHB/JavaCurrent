package day24;

import java.util.HashMap;

public class _04_Map {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız
        // isim, email, telefonu, adres

        HashMap<String, String> zehraKartvizit = new HashMap<>();
        zehraKartvizit.put("isim", "Zehra");
        zehraKartvizit.put("email", "zehra@gmail.com");
        zehraKartvizit.put("telefon", "0505676767");
        zehraKartvizit.put("adres", "Çekmeköy");

        System.out.println("zehraKartvizit.get(isim) = " + zehraKartvizit.get("isim"));
        System.out.println("zehraKartvizit.get(email) = " + zehraKartvizit.get("email"));

        HashMap<String, String> esmaKartvizit = new HashMap<>();
        esmaKartvizit.put("isim", "Esma");
        esmaKartvizit.put("email", "esma@gmail.com");
        esmaKartvizit.put("telefon", "0506878787");
        esmaKartvizit.put("adres", "Başakşehir");

        System.out.println("esmaKartvizit.get(isim) = " + esmaKartvizit.get("isim"));
        System.out.println("esmaKartvizit.get(email) = " + esmaKartvizit.get("email"));

        HashMap<String, HashMap<String, String>> kartvizitler = new HashMap<>();
        kartvizitler.put("Zehra", zehraKartvizit);
        kartvizitler.put("Esma", esmaKartvizit);

        System.out.println("Zehra nın emaili = " + kartvizitler.get("Zehra").get("email"));
        System.out.println("Zehra nın telefonu = " + kartvizitler.get("Zehra").get("telefon"));

        System.out.println("Esma nın emaili = " + kartvizitler.get("Esma").get("email"));
        System.out.println("Esma nın telefonu = " + kartvizitler.get("Esma").get("telefon"));
    }
}
