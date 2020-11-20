package com.tf.cuteWeather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author dongjinggezi
 * @date 2020/11/20 16:11
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
