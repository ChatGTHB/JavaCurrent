package day31._03_EnumQuestion;

public class Campus {
    public static void main(String[] args) {
        User user1 = new User("Ismet", Role.ADMIN, Status.ACTIVE);
        User user2 = new User("Ayse", Role.STAFF, Status.ACTIVE);
        User user3 = new User("Cilem", Role.MANAGER, Status.INACTIVE);

        User.deleteUser(user1);
        User.deleteUser(user2);
        System.out.println("user2 = " + user2);
    }
}
