package com.core.test;

import com.core.utils.Md5PasswordEncoder;

/**
 * @author ManhKM on 6/21/2022
 * @project Java-Utils
 */
public class MainMd5PasswordEncoder {
    public static void main(String[] args) {
        String passWord = "15A30a27a01aA@manhkm";
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        System.out.println("Encoder MD5: " + md5PasswordEncoder.encode(passWord));
        // 0fdc88f1d3369b7abbacc88927cb36e0

        System.out.println(md5PasswordEncoder.matches(passWord, "0fdc88f1d3369b7abbacc88929cb36e0"));
    }
}
