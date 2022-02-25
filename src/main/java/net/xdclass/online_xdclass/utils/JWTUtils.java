package net.xdclass.online_xdclass.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.xdclass.online_xdclass.model.entity.User;

import java.util.Date;

public class JWTUtils {

    private static long EXPIRE = 60000 * 60 * 24 * 7;

    private static String SECRET = "xdclass";

    private static String SUBJECT = "HDX";

    /**
     * 加密密钥
     */
    public static String geneJsonWebToken(User user){
        String token = Jwts.builder().setSubject(SUBJECT).claim("id",user.getId())
                .claim("name",user.getName()).claim("head_img",user.getHeadImg()).setIssuedAt(new Date())
                .setExpiration(new Date()).setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .signWith(SignatureAlgorithm.HS256,SECRET).compact();
        return token;
    }

    /**
     * @des:登陆状态还在就返回Claims,不在返回null
     * @param
     * @return
     */
    public static Claims checkJWT(String token){
        try{
            final Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
            return  claims;
        }catch(Exception e){
            return null;
        }

    }

}
