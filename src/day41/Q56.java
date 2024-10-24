package day41;

public class Q56 {
    public static void main(String[] args) {
        String[] names = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int idx = 0;

        try {
            for (String n : names) {  // Thomas 012345, Peter 01234
                pwd[idx] = n.substring(2, 6); // includes 2, includes 5 (grabs characters from 2 to 5)
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name"); // Invalid Name
        }
    }
}
//        omas
//        Invalid Name
