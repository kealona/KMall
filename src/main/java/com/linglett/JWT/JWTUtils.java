package com.linglett.JWT;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Map;

public class JWTUtils {

    /**
     * 生成token
     * @param name 用户Id
     * @param key 秘钥
     * @return 生成的token
     */
    public static String getToken(String name,String key){
        Algorithm algorithm = Algorithm.HMAC256(key);
        String token = JWT.create()
                .withClaim("name",name)
                .sign(algorithm);
        return token;
    }

    public static Map<String, Claim> DeToken(String token, String key){
        if (token == null || token.length() == 0) {
            System.out.println("token为空");
        }
        Algorithm algorithm = Algorithm.HMAC256(key);
        JWTVerifier jwtVerifier = JWT.require(algorithm).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        return decodedJWT.getClaims();
    }
}
