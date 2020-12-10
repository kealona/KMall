package com.linglett.JWT;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class JWTInterceptors implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
        Map<String,Object> map = new HashMap<>();
        //获取请求中的令牌
        String token = request.getHeader("token");
        try{
            JWTUtils.verify(token);//验证令牌
            return true;//放行请求
        }catch (SignatureVerificationException e){
            System.out.println("签名不一致异常");
            map.put("msg","无效签名！");
        }catch (TokenExpiredException e){
            System.out.println("令牌异常");
            map.put("msg","token过期！");
        }catch (AlgorithmMismatchException e){
            System.out.println("算法不匹配异常");
            map.put("msg","token算法不一致");
        }catch (InvalidClaimException e){
            System.out.println("失效payload异常");
            map.put("msg","token无效");
        }
        map.put("state",false);//设置状态
        String json = JSON.toJSONString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(json);
        return false;
    }
}
