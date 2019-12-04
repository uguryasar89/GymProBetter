package com.uguryasar.gymprobetter.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GymProLoginResponse extends GymBaseDto {

    @SerializedName("data")
    @Expose
    private GymProLoginResponseData data;

    public GymProLoginResponseData getData() {
        return data;
    }

    public void setData(GymProLoginResponseData data) {
        this.data = data;
    }

}
