import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.linglett.JWT.JWTUtils;
import com.linglett.dao.UserMapper;
import com.linglett.pojo.User;
import com.linglett.service.Impl.UserServiceImpl;
import com.linglett.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    @Autowired
    private UserService userService;

//    @PostMapping("/user/login")
//    public static void main(String[] args) {
//      User user = new User();
//      user.setUserId("2274748854@qq.com");
//      user.setPassword("12345678910");
//      Map<String,Object> map = new HashMap<>();
//      try{
//          User userDB = UserServiceImpl.loginUser(user);
//          Map<String,String> payload = new HashMap<>();
//          payload.put("userId",userDB.getUserId());
//          payload.put("password",userDB.getPassword());
//          //生成JWT令牌
//          String token = JWTUtils.getToken(payload);
//
//          map.put("state",true);
//          map.put("msg","认证成功");
//          //响应token
//          map.put("token",token);
//      }catch (Exception e){
//          map.put("state",false);
//          map.put("msg","认证失败");
//      }
//      return map;
//
//
//    }

//    @PostMapping("/user/test")
//    public Map<String,Object> test(HttpServletRequest request){
//        Map<String,Object> map = new HashMap<>();
//        //处理自己业务逻辑
//        String token = request.getHeader("token");
//
//        try{
//            DecodedJWT verify = JWTUtils.verify(token);
//            //验证token令牌
//            map.put("state",true);
//            map.put("msg","请求成功！");
//            return map;
//        }catch (SignatureVerificationException e){
//            System.out.println("签名不一致异常");
//            map.put("msg","无效签名！");
//        }catch (TokenExpiredException e){
//            System.out.println("令牌异常");
//            map.put("msg","token过期！");
//        }catch (AlgorithmMismatchException e){
//            System.out.println("算法不匹配异常");
//            map.put("msg","token算法不一致");
//        }catch (InvalidClaimException e){
//            System.out.println("失效payload异常");
//            map.put("msg","token无效");
//        }
//        map.put("state",false);
//        return map;
//
//    }

    private UserMapper userMapper;
    public User loginUser(User user){
        User userDB = userMapper.LoginUser(user);
        if(userDB!=null){
            return userDB;
        }
        throw  new RuntimeException("认证失败");
    }
}
