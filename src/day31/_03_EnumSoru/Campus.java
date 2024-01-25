package day31._03_EnumSoru;

public class Campus {

    public static void main(String[] args) {

        User user1 = new User("ismet", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Ayşe", Role.PERSONEL, Statu.AKTIF);
        User user3 = new User("Çilem", Role.MUDUR, Statu.PASIF);

        User.userSil(user1);
        User.userSil(user2);
        System.out.println("user2 = " + user2);
    }
}
