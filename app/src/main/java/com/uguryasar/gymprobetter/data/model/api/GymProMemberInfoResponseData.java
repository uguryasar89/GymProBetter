package com.uguryasar.gymprobetter.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GymProMemberInfoResponseData {

    @SerializedName("memberID")
    @Expose
    private Integer memberID;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("picture")
    @Expose
    private Object picture;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("gsmPhone")
    @Expose
    private String gsmPhone;
    @SerializedName("homePhone")
    @Expose
    private String homePhone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("identificationNumber")
    @Expose
    private String identificationNumber;
    @SerializedName("gender")
    @Expose
    private Integer gender;
    @SerializedName("loginUserName")
    @Expose
    private String loginUserName;
    @SerializedName("noSMS")
    @Expose
    private Integer noSMS;
    @SerializedName("noEmail")
    @Expose
    private Integer noEmail;
    @SerializedName("pushToken")
    @Expose
    private String pushToken;
    @SerializedName("isStaff")
    @Expose
    private Boolean isStaff;

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGsmPhone() {
        return gsmPhone;
    }

    public void setGsmPhone(String gsmPhone) {
        this.gsmPhone = gsmPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public Integer getNoSMS() {
        return noSMS;
    }

    public void setNoSMS(Integer noSMS) {
        this.noSMS = noSMS;
    }

    public Integer getNoEmail() {
        return noEmail;
    }

    public void setNoEmail(Integer noEmail) {
        this.noEmail = noEmail;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public Boolean getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

}