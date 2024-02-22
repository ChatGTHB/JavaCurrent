package day40;

public class S29 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

//        for(int e=1; e<=5 ; e+=1)
//            System.out.print(a[e]); // 2,3,4,5 outofboundException

        for (int e = 0; e < 5; e += 2)
            System.out.print(a[e]); // 1,3,5

    }
}
