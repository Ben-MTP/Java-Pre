package com.core.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @author ManhKM on 6/20/2022
 * @project Java-Utils
 */
public class AESUtil {
    public static String encrypt(String plainText, String key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] decodeKey = Base64.getDecoder().decode(key);
            SecretKeySpec secretKey = new SecretKeySpec(decodeKey, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainText.getBytes("UTF8"));
            String encryptedString = new String(Base64.getEncoder().encode(cipherText), "UTF-8");
            return encryptedString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encryptedText, String key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            byte[] decodeKey = Base64.getDecoder().decode(key);
            SecretKeySpec secretKey = new SecretKeySpec(decodeKey, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] cipherText = Base64.getDecoder().decode(encryptedText.getBytes("UTF8"));
            String decryptedString = new String(cipher.doFinal(cipherText), "UTF-8");
            return decryptedString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String key = "manhkm1233232323232323";
        System.out.println(encrypt("3004199632323232323232", key));

        System.out.println(decrypt("D5WwBEWjF+vEM7pdaEaxIo+h71x0PIh5I0unrCv+rnc=", key));
    }
}
