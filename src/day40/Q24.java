package day40;

public class Q24 {
    public static void main(String[] args) {
        String[] strs = new String[2]; // null

        // Default value in String arrays is NULL
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

        int idx = 0;

        for (String s : strs) {
            // strs[idx] = strs[idx] + " element"; this would work
            strs[idx].concat(" element " + idx); // null.concat can't be done
            idx++;
        } // concat: appends to the existing value

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
