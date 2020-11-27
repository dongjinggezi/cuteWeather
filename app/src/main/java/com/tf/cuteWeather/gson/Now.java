package com.tf.cuteWeather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * @author dongjinggezi
 * @date 2020/11/27 15:19
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
