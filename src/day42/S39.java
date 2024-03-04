package day42;

public class S39 {

    public static void main(String[] args) {

        String[][] shirts = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        // a) medium
        for (int index = 1; index < 2; index++) {
            for (int idx = 1; idx < 2; idx++) {
                System.out.println(shirts[index][idx] + ":");
            }
        }

        //b) small:
        for (int index = 0; index < 2; ++index) { //0,1
            for (int idx = 0; idx < index; ++idx) { // 0 da yok
                System.out.println(shirts[index][idx] + ":");
            }
        }

        // d) 2 sınır index değerini aştığı için RunTime hatası verir
//        for (int index = 0; index <= 2; ) {
//            for (int idx = 0; idx <= 2; ) {
//                System.out.println(shirts[index][idx] + ":");
//                idx++;
//            }
//            index++;
//        }

        //c) doğru
        for (String[] c : shirts) { // satırlara c adını vererek gönderiyor
            for (String s : c) { // her satırdaki eleman s adını vererek yazdırıyor
                System.out.println(s + ":");
            }
        }
    }
}
