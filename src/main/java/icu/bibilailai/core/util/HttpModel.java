package icu.bibilailai.core.util;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpModel {
    private static final CloseableHttpClient HTTP_CLIENT = HttpClients.createDefault();

    private static final RequestConfig REQUEST_CONFIG = RequestConfig.custom()
            .setSocketTimeout(1000)
            .setConnectTimeout(2000)
            .setConnectionRequestTimeout(3000)
            .build();

    public static String sendPost(String url, Object obj){
        HttpPost post = new HttpPost(url);
        post.setConfig(REQUEST_CONFIG);
        post.setHeader("content-type", "application/json");
        String result = "";
        try {
            StringEntity stringEntity = new StringEntity(JSON.toJSONString(obj));
            stringEntity.setContentEncoding("UTF-8");
            stringEntity.setContentType("application/json");
            post.setEntity(stringEntity);
            CloseableHttpResponse execute = null;
            execute = HTTP_CLIENT.execute(post);
            if (execute.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(execute.getEntity());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

}
