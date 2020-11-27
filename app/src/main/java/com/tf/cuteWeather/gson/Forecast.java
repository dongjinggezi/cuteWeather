package com.tf.cuteWeather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * @author dongjinggezi
 * @date 2020/11/27 15:19
 */
public class Forecast {

    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
