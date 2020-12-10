package com.linglett.JWT;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {

    private static final String TOKEN = "token!L721224F";

    /**
     * 生成token  header.payload.sing
     * @return 返回生成的token
     */
    public static String getToken(Map<String,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);

        //创建jwt builder
        JWTCreator.Builder builder= JWT.create();

        //payload
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });

        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(TOKEN));
        System.out.println(token);
        return token;
    }

    /**
     * 验证token的合法性
     * @param token 需要验证的token
     * @return
     */
    public static DecodedJWT verify(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }
}
