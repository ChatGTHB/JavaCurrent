package day21;

public class _02_JavaMethod {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 12;
        int n3 = 12;

        int result = findSum(n1, n2);
        int result2 = findSum(n1, n2, n3);
        String result3 = findSum("ismet", "temur");

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static String findSum(String firstName, String lastName) {
        return firstName + lastName;
    }

    public static int findSum(int n1, int n2) {
        return n1 + n2;
    }

    public static int findSum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
