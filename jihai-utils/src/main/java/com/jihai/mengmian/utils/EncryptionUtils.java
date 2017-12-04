package com.jihai.mengmian.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by kevinchen on 2016/12/15.
 * 加密算法工具（base64,AES128【前两种可逆，后面的不可逆】md5,sha1,sha256,sha384,sha512）
 */
public class EncryptionUtils {

    /**可逆加密算法 BASE64,AES128*/
    public static String base64Encode(String data){
        return Base64.encodeBase64String(data.getBytes());
    }

    public static String base64Decode(String data){
        return new String(Base64.decodeBase64(data.getBytes()));
    }

    public static String aes128Encrypt(String data,String key){
        return AES128.encrypt(data,key);
    }

    public static String aes128Decrypt(String data,String key){
        return AES128.decrypt(data,key);
    }


    /**不可逆加密算法 MD5、SHA1、SHA256、SHA384、SHA512*/
    public static String md5(String data) {
        return DigestUtils.md5Hex(data);
    }

    public static String sha1(String data) {
        return DigestUtils.sha1Hex(data);
    }

    public static String sha256(String data) {
        return DigestUtils.sha256Hex(data);
    }

    public static String sha384(String data){
        return DigestUtils.sha384Hex(data);
    }

    public static String sha512(String data){
        return DigestUtils.sha512Hex(data);
    }



}
