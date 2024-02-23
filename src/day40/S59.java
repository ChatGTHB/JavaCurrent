package day40;

public class S59 {

    public static void main(String[] args) {

        int[] intArr = {8, 16, 32, 64, 128};

        //a
//        for(int i: intArr)
//            System.out.print(intArr[i]+" ");

        //b  doğru cevap
        for (int i : intArr)
            System.out.print(i + " ");

        //c   compile error
//        for(int i=0: intArr){
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

        //d  indexleri yazar
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(i + " "); // 0,1,2,3,4
        }

        //e  doğru cevap
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }

        //f   compile error
//        for(int i; i< intArr.length ; i++){
//            System.out.println(intArr[i]);
//        }
    }
}
