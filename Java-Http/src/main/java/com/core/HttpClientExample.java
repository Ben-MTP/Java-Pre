package com.core;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author ManhKM on 8/3/2022
 * @project Java-Http
 * -----
 * Thiết lập tunnel trên server 10.2.19.2 --> port 5000 -> connect đến webadmin + api
 * Tạo HttpClient -> call đến local:8080
 */
public class HttpClientExample {

    public static void main(String[] args) throws InterruptedException {
        final String url = "http://localhost:5000/";
        final CloseableHttpClient httpclient = HttpClients.createSystem();

        for(int i = 0; i < 10; i++){
            System.out.println("Starting index [" + i + "]");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        HttpGet httpGet = new HttpGet(url);
                        CloseableHttpResponse response = httpclient.execute(httpGet);
                        HttpEntity entity = response.getEntity();
                        EntityUtils.consume(entity);

                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        Thread.sleep(10000);
    }
}
