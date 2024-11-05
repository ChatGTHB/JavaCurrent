package day42;

public class Q82 {
    public static void main(String[] args) {
        String[][] chs = new String[2][]; // 2 satır , sutunlar belli değil
        chs[0] = new String[2];  //2 tane sütun  , 0.satır 2 sutun olsun
        chs[1] = new String[5];  //5 tane sütun ,  1.satır 5 sütun olsun
        int i = 97;

        for (int a = 0; a < chs.length; a++) {  //2
            for (int b = 0; b < chs.length; b++) { //2
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
