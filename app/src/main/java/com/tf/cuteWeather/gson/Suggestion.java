package com.tf.cuteWeather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * @author dongjinggezi
 * @date 2020/11/27 15:19
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }


}
