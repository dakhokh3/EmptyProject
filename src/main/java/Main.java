import dao.UserDao;
import dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
       UserDao userDao = new UserDaoHibernateImpl();
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
