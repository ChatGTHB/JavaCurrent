package day41;

public class S56 {

    public static void main(String[] args) {

        String[] names = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int idx = 0;

        try {
            for (String n : names) {  //Thomas 012345, Peter 01234
                pwd[idx] = n.substring(2, 6); // 2 dahil, 5 dahil 2-5 dahil alıyor
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name"); //Invalid Name
        }
    }
}
//        omas
//        Invalid Name