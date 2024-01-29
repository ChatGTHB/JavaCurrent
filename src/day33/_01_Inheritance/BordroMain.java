package day33._01_Inheritance;

public class BordroMain {
    public static void main(String[] args) {

        YoneticiYeni yy = new YoneticiYeni();

        yy.setAd("Oğuzhan");

        System.out.println("yy.getAd() = " + yy.getAd());
        // ...
        // Diğer classın her özelliğini ve metodlarını
        // alıp kullanmaya INHERITANCE yani kalıtım
        // yani miras alma denir.
    }
}
