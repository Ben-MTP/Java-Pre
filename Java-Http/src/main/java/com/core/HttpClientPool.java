package com.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * @author ManhKM on 8/10/2022
 * @project Java-Http
 */
public class HttpClientPool {
    private static final PoolingHttpClientConnectionManager POOLING_CONN_MANAGER = new PoolingHttpClientConnectionManager();

    static {
        POOLING_CONN_MANAGER.setMaxTotal(20000);
        POOLING_CONN_MANAGER.setDefaultMaxPerRoute(15000);
    }

    private static final CloseableHttpClient client = HttpClients.custom().setConnectionManager((HttpClientConnectionManager)POOLING_CONN_MANAGER).build();

    public static String sendPostSOAP(String request, String urlApi, int timeout, String contentType) throws IOException {
        HttpPost httpPost = new HttpPost(urlApi);
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(timeout).setConnectTimeout(timeout).setSocketTimeout(timeout).build();
        StringEntity stringEntity = new StringEntity(request, StandardCharsets.UTF_8);
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Content-Type", contentType);
        httpPost.setHeader("SOAPAction", "");
        httpPost.setEntity((HttpEntity)stringEntity);
        StringBuilder response = new StringBuilder();
        InputStreamReader isr = null;
        BufferedReader in = null;
        OutputStream out = null;
        try (CloseableHttpResponse httpResponse = client.execute((HttpUriRequest)httpPost)) {
            InputStream inputStream = httpResponse.getEntity().getContent();
            isr = new InputStreamReader(inputStream);
            in = new BufferedReader(isr);
            String value = null;
            while ((value = in.readLine()) != null)
                response.append(value);
            in.close();
            return response.toString();
        } finally {
            if (out != null)
                try {
                    out.close();
                } catch (IOException iOException) {}
            if (isr != null)
                try {
                    isr.close();
                } catch (IOException iOException) {}
            if (in != null)
                try {
                    in.close();
                } catch (IOException iOException) {}
        }
    }

    public static String sendPostAPI(String request, String urlApi, int timeout, String cookie) throws IOException {
        HttpPost httpPost = new HttpPost(urlApi);
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(timeout).setConnectTimeout(timeout).setSocketTimeout(timeout).build();
        StringEntity stringEntity = new StringEntity(request, StandardCharsets.UTF_8);
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Cookie", cookie);
        httpPost.setEntity((HttpEntity)stringEntity);
        StringBuilder response = new StringBuilder();
        InputStreamReader isr = null;
        BufferedReader in = null;
        OutputStream out = null;
        try (CloseableHttpResponse httpResponse = client.execute((HttpUriRequest)httpPost)) {
            InputStream inputStream = httpResponse.getEntity().getContent();
            isr = new InputStreamReader(inputStream);
            in = new BufferedReader(isr);
            String value = null;
            while ((value = in.readLine()) != null)
                response.append(value);
            in.close();
            return response.toString();
        } finally {
            if (out != null)
                try {
                    out.close();
                } catch (IOException iOException) {}
            if (isr != null)
                try {
                    isr.close();
                } catch (IOException iOException) {}
            if (in != null)
                try {
                    in.close();
                } catch (IOException iOException) {}
        }
    }

    public static String sendPostAPI(String request, String urlApi, int timeout) throws IOException {
        HttpPost httpPost = new HttpPost(urlApi);
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(timeout).setConnectTimeout(timeout).setSocketTimeout(timeout).build();
        StringEntity stringEntity = new StringEntity(request, StandardCharsets.UTF_8);
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
//        httpPost.setHeader("Cookie", cookie);
        httpPost.setEntity((HttpEntity)stringEntity);
        StringBuilder response = new StringBuilder();
        InputStreamReader isr = null;
        BufferedReader in = null;
        OutputStream out = null;
        try (CloseableHttpResponse httpResponse = client.execute((HttpUriRequest)httpPost)) {
            InputStream inputStream = httpResponse.getEntity().getContent();
            isr = new InputStreamReader(inputStream);
            in = new BufferedReader(isr);
            String value = null;
            while ((value = in.readLine()) != null)
                response.append(value);
            in.close();
            return response.toString();
        } finally {
            if (out != null)
                try {
                    out.close();
                } catch (IOException iOException) {}
            if (isr != null)
                try {
                    isr.close();
                } catch (IOException iOException) {}
            if (in != null)
                try {
                    in.close();
                } catch (IOException iOException) {}
        }
    }
}
