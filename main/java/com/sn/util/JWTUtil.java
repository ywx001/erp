package com.sn.util;
/**
 * token操作工具类
 */

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sn.entity.User;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt工具，用来生成、校验token以及提取token中的信息
 */
public class JWTUtil {
    /**
     * 指定一个token过期时间（毫秒）,7天
     */
    private static final long EXPIRE_TIME=7 * 24 * 60 * 60 * 1000;
    /**
     * token私匙
     */
    private static String TOKEN_SECRET ="4883f1c4-1664-4e13-9537-f52e8da20f31";

    /**
     * 生成token
     * @param account
     * @param id
     * @return
     */
    public static String sign(String account,Integer id)  {
        try {
            Date date = new Date(System.currentTimeMillis()+EXPIRE_TIME);
            //使用密钥进行哈希
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            Map<String,Object>map = new HashMap<>(2);
            map.put("typ","JWT");
            map.put("alg","HS256");
            return JWT.create()
                    .withHeader(map)
                    .withClaim("account",account)
                    .withClaim("id",id)
                    //过期时间
                    .withExpiresAt(date)
                    //签名算法
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 校验token是否正确
     * @param token
     * @return
     */
    public  static boolean checkToken(String token){
        try {
            verifyToken(token);
            return true;
        }catch (Exception e){
           e.printStackTrace();
           return false;
        }
    }

    /**
     * 根据token获取Map<String, Claim>
     * @param token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static Map<String, Claim> verifyToken(String token) throws UnsupportedEncodingException {

            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build();
            DecodedJWT jwt  = verifier.verify(token);
        return jwt.getClaims();
    }

    /**
     * 获取Id
     * @param map
     * @return
     */
    public static Integer getId(Map<String, Claim>map){
        if(null==map||map.size()==0||null == map.get("id")){
            return null;
        }
        return map.get("id").asInt();
    }

    /**
     * 在token中获取ID
     * @param token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static Integer getId(String token) throws UnsupportedEncodingException {
        Map<String, Claim> map =    verifyToken(token);
        if(null==map||map.size()==0||null == map.get("id")){
            return null;
        }

        return map.get("id").asInt();
    }

    /**
     * 在token中获取account
     * @param token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String getAccount(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("account").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 根据token获取user
     *
     */
    public static User getUser(String token) throws UnsupportedEncodingException {
        Map<String, Claim> map =    verifyToken(token);
        if(null==map||map.size()==0||null == map.get("account")||null == map.get("id")){
            return null;
        }
        User user = new User();
        user.setId(getId(token));
        user.setAccount(getAccount(token));
        return user;
    }

    /**
     * 判断是否过期
     */
    public static boolean isExpire(String token){
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getExpiresAt().getTime() < System.currentTimeMillis() ;
    }

}
