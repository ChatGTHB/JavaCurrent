package Gun31._01_Enum;

public class Ornek1 {

    public static void main(String[] args) {

        // Verilen bir ay noya göre, ayın gün sayısını veren programı yazınız

        int ayNo = 5; // Mayıs

        switch (ayNo) {
            case 2:
                System.out.println(28);
                break;
            case 1: // Ocak
            case 3: // mart
            case 5: // Mayıs
            case 22:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }

        if (ayNo == 6) { // haziran ayı
            // zam yap
        }


        // Admin en yetkili kullanıcı 0 Ebuzer hoca
        // Student - Hatun 1
        // Accountant - Muhasebeci 2

//        if (kullanici Yetikisi == 3){ // muhasebe
//
//        }

        String ayAd = "Mayıs";
        switch (ayAd) {
            case "şubat":
                System.out.println(28);
                break;
            case "Ocak":
            case "mart":
            case "agustos":
            case "haziran":
            case "aralık":
                System.out.println(31);
                break;
            case "temuz":
            case "eylul":
            case "Ekim":
            case "KASIM":
                System.out.println(30);
                break;
        }
    }
}
