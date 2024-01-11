package day26._04_Example;

public class Rectangle {
    int width;
    int length;

    void alan() { // hesapla yaz
        System.out.println("Alan=" + (this.width * this.length));
    }

    void cevre() {
        System.out.println("Cevre=" + (this.width + this.length) * 2);
    }

    int alan2() { // hesapla geri gönder
        return (this.width * this.length);
    }

    void degerAta(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
