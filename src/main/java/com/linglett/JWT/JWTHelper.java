package com.linglett.JWT;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Calendar;
import java.util.Map;

public class JWTHelper {
    //公共密钥客户端不会知道
    public static String TOKEN="token!L721224F";

    /**
     * 生成token
     * @param map 传入payload
     * @return 返回token
     */
    public static String createToken(Map<String,String> map) {
        System.out.println("--------创建Token--------");
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND,7);
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(TOKEN)).toString();
    }

    /**
     * 验证token
     * @param token
     * @return
     */
    public static void verifyToken(String token) {
        System.out.println("-------- -- 验证Token --------- verifyToken()");
        JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

    /**
     * 获取token中的payload
     * @param token
     * @return
     */
    public static DecodedJWT getToken(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }

   /* public static void main(String[] args) {
        String token = createToken();
        //System.out.println("Token:"+token);
        Map<String,Claim> claims=verifyToken(token);
        System.out.println(claims.get("name").asString());
        System.out.println(claims.get("age").asString());
        System.out.println(claims.get("username").asString());
        System.out.println(claims.get("org")==null?null:claims.get("org").asString());

        //测试过期token
        //String GuoQiToken="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhdXRoMCJ9.izVguZPRsBQ5Rqw6dhMvcIwy8_9lQnrO3vpxGwPCuzs";
        //Map<String,Claim> claims2=verifyToken(GuoQiToken);
    }*/

}
