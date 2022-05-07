package com.core.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author ManhKM on 4/28/2022
 * @project http-request-demo
 */
public class CreateRequest {
    public static void main(String[] args) {
        doRequest();
    }

    private static void doRequest() {
        URL url = null;
        try {
            url = new URL("https://neo.vn/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            System.out.println("-----> " + con);

            /**
             * Coding something here!
             */
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
