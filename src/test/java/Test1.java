import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.linglett.pojo.User;
import com.linglett.service.CodeService;
import com.linglett.service.Impl.CodeServiceImpl;
import com.linglett.service.Impl.UserServiceImpl;
import com.linglett.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

public class Test1 {

    public static void main(String[] args) {
        String rg = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";
        String email = "591446829@qq.com";
        System.out.println("email正则="+email.matches(rg));

        String userJson = "{\"userId\":\"2274748854@qq.com\",\"password\":\"12345678910\"}";
        User user = JSON.parseObject(userJson,User.class);

        System.out.println(user.toString());
        System.out.println("实现登录");

       // String token = UserServiceImpl.loginUser(user);
        System.out.println("登录成功");

        //把获取的User信息以JSON字符串形式发送给前端
        String userData = JSONObject.toJSONString(user);
        System.out.println(userData);
    }

   // @Autowired
   /* @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("del/{userId}")
    public void deleteUserById(@PathVariable("userId")String userId) {
        System.out.println("执行controller层");
        userService.deleteUserById(userId);
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public String login(@RequestBody String userJson) {
        //从前端获取userdata
        User user = JSON.parseObject(userJson,User.class);

        System.out.println(user.toString());
        System.out.println("实现登录");

        user = userService.loginUser(user);
        System.out.println("登录成功");

        //把获取的User信息以JSON字符串形式发送给前端
        String userData = JSONObject.toJSONString(user);
        System.out.println(userData);

        return userData;
    }*/
}
