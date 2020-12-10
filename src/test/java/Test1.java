import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.linglett.pojo.User;

public class Test1 {
    public static void main(String[] args) {
        /*UserService userService = new UserServiceImpl();
        userService.deleteUserById("111");*/
        String txt = "{\"username\":\"2274748854@qq.com\",\"password\":\"12345678910\"}";
        JSONObject json = JSON.parseObject(txt);
        User user = JSON.parseObject(txt,User.class);
        System.out.println(user.toString());
        System.out.println(json.get("username"));
        System.out.println(json.get("password"));
    }
}
