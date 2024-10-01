package day40;

public class Q35 {
    public static void main(String[] args) {
        int[] smallArray = {1, 2, 3};
        int[] largeArray = {1, 2, 3, 4, 5};

        largeArray = smallArray; // largeArray now refers to smallArray

        for (int element : largeArray)
            System.out.print(element + ":");
    }
}
