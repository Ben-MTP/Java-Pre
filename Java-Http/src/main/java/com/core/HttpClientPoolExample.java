package com.core;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

/**
 * @author ManhKM on 8/3/2022
 * @project Java-Http
 */
public class HttpClientPoolExample {

    public static void main(String[] args) throws InterruptedException {
        PoolingHttpClientConnectionManager pool = new PoolingHttpClientConnectionManager();
        pool.setDefaultMaxPerRoute(1);
        pool.setMaxTotal(1);
        final CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(pool).build();

        final String url = "http://localhost:5000/";

        for (int i = 0; i < 10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    HttpGet httpGet = new HttpGet(url);
                    try {
                        CloseableHttpResponse response = httpClient.execute(httpGet);
                        HttpEntity entity = response.getEntity();
                        EntityUtils.consume(entity);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
        Thread.sleep(1000);
    }
}
