package com.core.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author ManhKM on 6/21/2022
 * @project Java-Utils
 */
public class Md5PasswordEncoder implements PasswordEncoder {
    private Logger logger = LogManager.getLogger(Md5PasswordEncoder.class);

    @Override
    public String encode(CharSequence rawPassword) {
        StringBuffer sb = new StringBuffer("");

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(String.valueOf(rawPassword).getBytes("iso-8859-1"));
            byte[] digest = md.digest();
            for (byte b : digest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);
            }
            md.reset();

            md.update(sb.toString().getBytes("iso-8859-1"));
            digest = md.digest();
            sb = new StringBuffer("");
            for (byte b : digest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            logger.error("Encode exception: ", e);
            return null;
        }
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        String encode = encode(rawPassword);
        return encode != null && encode.equals(encodedPassword);
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return false;
    }

}
