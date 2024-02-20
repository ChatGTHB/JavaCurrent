package day40;

public class S24 {

    public static void main(String[] args) {

        String[] strs = new String[2]; //null

        // String ifadelerin dizilerinde default değer NULL
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

        int idx = 0;

        for (String s : strs) {
            //strs[idx] = strs[idx] + "element"; bu olurdu
            strs[idx].concat(" element " + idx); // null.concat  olamaz
            idx++;
        } //concat : var olan değerinin üzerine ekle

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
