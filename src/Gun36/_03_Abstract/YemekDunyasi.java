package Gun36._03_Abstract;

public class YemekDunyasi {

    public static void main(String[] args) {

        Baklava b = new Baklava();
        b.setName("Baklava");
        System.out.println(b.getName());
        b.madeIn();
        b.taste();//lezzeti, tadı

        CheeseCake c = new CheeseCake();
        c.setName("CheeseCake");
        System.out.println(c.getName());
        c.madeIn();
        c.taste();//lezzeti, tadı

        Food g = new GreekSalad();
        g.setName("GreekSalad");
        System.out.println(g.getName());
        g.madeIn();
        g.taste();//lezzeti, tadı

        Salad s = new SezerSalad();
        s.setName("SezerSalad");
        System.out.println(s.getName());
        s.madeIn();
        s.taste();//lezzeti, tadı

        System.out.println("s = " + s);
    }
}
