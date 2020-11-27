package com.tf.cuteWeather.gson;

/**
 * @author dongjinggezi
 * @date 2020/11/27 15:19
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
