package com.uguryasar.gymprobetter.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GymBaseDto {

    @SerializedName("isSuccessful")
    @Expose
    private Boolean isSuccessful;
    @SerializedName("errorCode")
    @Expose
    private Integer errorCode;
    @SerializedName("errorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("exception")
    @Expose
    private Object exception;
    @SerializedName("dataHash")
    @Expose
    private String dataHash;
    @SerializedName("ipAddress")
    @Expose
    private String ipAddress;
    @SerializedName("executionTime")
    @Expose
    private Integer executionTime;
    @SerializedName("extraInfo")
    @Expose
    private Object extraInfo;

    public Boolean getIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(Boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getException() {
        return exception;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public String getDataHash() {
        return dataHash;
    }

    public void setDataHash(String dataHash) {
        this.dataHash = dataHash;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

}