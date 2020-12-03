import com.linglett.dao.UserMapper;
import com.linglett.service.UserService;
import com.linglett.service.UserServiceImpl;

public class Test1 {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.deleteUserById("111");
    }
}
