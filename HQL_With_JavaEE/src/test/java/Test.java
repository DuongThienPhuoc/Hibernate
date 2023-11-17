import com.example.hql_with_javaee.dao.UserDAO;
import com.example.hql_with_javaee.dao.UserDAOImpl;
import com.example.hql_with_javaee.entity.UserEntity;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        List<UserEntity> listUser = userDAO.getAllUser();
        listUser.forEach(System.out::println);
    }
}
