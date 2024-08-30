package day31._03_EnumQuestion;

public class User {
    String userName;
    Role role;
    Status status;

    public User(String userName, Role role, Status status) {
        this.userName = userName;
        this.role = role;
        this.status = status;
    }

    public static void deleteUser(User user){

        if (user.role == Role.ADMIN)
            System.out.println("Admin cannot be deleted");
        else
            user.status = Status.INACTIVE;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
