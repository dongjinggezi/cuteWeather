package com.tf.cuteWeather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author dongjinggezi
 * @date 2020/11/27 15:15
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
