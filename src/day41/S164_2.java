package day41;

public class S164_2 {

    public static void main(String[] args) {

        int[] data = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for (int e : data) {

            if (e != key) {  // 2014 den farklı olduğunda continue
                continue;
            }

            count++;  // 2014 değrinde count 1 oldu, 2014 2
        }
        System.out.println(count + " Found");
    }
}
