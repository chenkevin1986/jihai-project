package com.jihai.mengmian.jwt;

import io.jsonwebtoken.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

/**
 * Created by kevinchen on 2017/2/25.
 */
public class JwtUtils {

    /**
     * 由字符串生成加密key
     * @return
     */
    public static SecretKey generalKey(String stringKey){
        if (StringUtils.isBlank(stringKey)){
            return null;
        }
        byte[] encodedKey = Base64.decodeBase64(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 创建jwt
     * @param id token_id
     * @param subject   用户信息
     * @param ttlMillis  有效期时长
     * @return
     * @throws Exception
     */
    public static String createJWT(String stringKey, long nowMillis, String id, String subject, long ttlMillis) throws Exception {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        Date now = new Date(nowMillis);
        SecretKey key = generalKey(stringKey);
        JwtBuilder builder = Jwts.builder()
                .setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .signWith(signatureAlgorithm, key);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * 解密jwt
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String stringKey,String jwt){
        Claims claims = null;
        try{
            claims = Jwts.parser()
                    .setSigningKey(generalKey(stringKey))
                    .parseClaimsJws(jwt).getBody();
        }catch (JwtException e){
            e.printStackTrace();
        }
        return claims;
    }
}
