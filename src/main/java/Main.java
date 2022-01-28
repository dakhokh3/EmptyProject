import dao.UserDao;
import dao.UserDaoHibernateImpl;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
       UserServiceImpl userDao = new UserServiceImpl();
       userDao.createUsersTable();
       userDao.saveUser("Ivan","Petrov",(byte)24);
       userDao.saveUser("Vladimir","Ivanov",(byte)45);
       userDao.saveUser("Sergey","Sidorov",(byte)14);
       userDao.saveUser("Alexey","Makhno",(byte)55);
       userDao.getAllUsers();
       userDao.cleanUsersTable();
       userDao.dropUsersTable();
    }
}
