import com.alibaba.fastjson.JSON;
import com.linglett.pojo.User;
import com.linglett.pojo.goods;
import com.linglett.service.UserService;
import com.linglett.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    @Autowired
    @Qualifier("UserServiceImpl")
    public static UserService userService;

    public static void main(String[] args) {
        //从前端获取userdata
        String userJson = "{\"username\":\"1\",\"password\":\"1\"}";
        User user = JSON.parseObject(userJson,User.class);

        Map<String,String> map=new HashMap<String,String>();
        map.put("userId", user.getUserId());
        map.put("password", user.getPassword());

        System.out.println(user.toString());
        System.out.println("实现这个方法");

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.loginUser(user);
        System.out.println("success!");
        /*if(userServiceImpl.loginUser(user)!=null) {
            System.out.println("实现serviceImpl方法");
        }*/
    }
}
