package com.jihai.mengmian.utils;


import com.jihai.mengmian.utils.common.LOG;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by kevinchen on 2016/11/16.
 */
public class AES128 {

    static final String KEY_ALGORITHM ="AES";
    static final String CIPHER_ECB_PKCS5="AES/ECB/PKCS5Padding";

    /**
     * AES128 加密
     * @param src
     * @param key
     * @return
     */
    public static String encrypt(String src,String key){
        try {
            byte[] resultArr = encode(src.getBytes("utf-8"), key.getBytes());
            return bytesToHexString(resultArr);
        }catch (Exception e){
           LOG.error(AES128.class,"source:"+src+" , encrypt error ! ",e);
            throw new RuntimeException("source:"+src+" , encrypt error ! ");
        }
    }

    /**
     * AES128 解密
     * @param src
     * @param key
     * @return
     */
    public static String decrypt(String src,String key){
        try{
            byte[] decryptFrom = parseHexStr2Byte(src);
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(),KEY_ALGORITHM));// 初始化
            byte[] result = cipher.doFinal(decryptFrom);
            return new String(result); // 加密
        }catch (Exception e){
            LOG.error(AES128.class,"source:"+src+" , encrypt error ! ",e);
            throw new RuntimeException("source:"+src+" , encrypt error ! ");
        }
    }

    private static byte[] encode(byte[] charsetByteAry,byte[] rawByteAry){
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(rawByteAry,KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(CIPHER_ECB_PKCS5);
            cipher.init(Cipher.ENCRYPT_MODE,skeySpec);
            return cipher.doFinal(charsetByteAry);
        }catch (Exception e){
            LOG.error(AES128.class,"charsetByteAry:"+charsetByteAry +", rawByteAry:"+rawByteAry,e);
            throw new RuntimeException("charsetByteAry:"+charsetByteAry +", rawByteAry:"+rawByteAry);
        }
    }

    /**
     * 将二进制转换成16进制
     * @param srcArr
     * @return
     */
    private static String bytesToHexString (byte[] srcArr){
        if (srcArr==null || srcArr.length <=0){
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < srcArr.length; i++) {
            int j = srcArr[i] & 0xFF;
            String hexStr = Integer.toHexString(j);
            if (hexStr.length() < 2){
                sb.append(0);
            }
            sb.append(hexStr);
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     */
    private static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


}
