package day21;

public class _03_JavaMethod {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 12;
        int n3 = 12;
        int n4 = 12;

        int result = findSum(n1, n2);
        int result2 = findSum(n1, n2, n3);
        int result3 = findSum(n1, n2, n3, n4);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static int findSum(int n1, int n2) {
        return n1 + n2;
    }

    public static int findSum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static int findSum(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }
}
