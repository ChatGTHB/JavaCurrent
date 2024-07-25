package day21;

public class _03_JavaMethod_2 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 12;
        int n3 = 12;
        int n4 = 12;

        int result1 = findSum(n1, n2);
        int result2 = findSum(n1, n2, n3);
        int result3 = findSum(n1, n2, n3, n4);
        int result4 = findSum(n1, n2, n3, n4, 67);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    // No matter how many numbers are provided, they can all be processed in an array
    public static int findSum(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        return sum;
    }
}
