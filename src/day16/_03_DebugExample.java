package day16;

public class _03_DebugExample {
    public static void main(String[] args) {
        // F8 -> sonraki adım
        // F9 -> bir breakpointten diğerine atlamak için kullanılır
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlaması istedğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılır. Program ilk olarak breakpoint de
        // durur ve F8 ile adım adım ilerletilir. Bu şekilde hem değerler izlenir
        // hem de nasıl çalıştığı test edilebilir. F9 ile bir breakpointten diğer
        // breakpointe atlanabilir.

        int a=10;

        a=1000;

        a=a+100;

        a=a+5;

        System.out.println("a = " + a);
    }
}
