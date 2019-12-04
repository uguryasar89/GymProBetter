package com.uguryasar.gymprobetter.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GymProMemberInfoResponse extends GymBaseDto {

    @SerializedName("data")
    @Expose
    private GymProMemberInfoResponseData data;

    public GymProMemberInfoResponseData getData() {
        return data;
    }

    public void setData(GymProMemberInfoResponseData data) {
        this.data = data;
    }

}