import service.UserService;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan","Petrov",(byte)24);
        userService.saveUser("Vladimir","Ivanov",(byte)45);
        userService.saveUser("Sergey","Sidorov",(byte)14);
        userService.saveUser("Alexey","Makhno",(byte)55);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
