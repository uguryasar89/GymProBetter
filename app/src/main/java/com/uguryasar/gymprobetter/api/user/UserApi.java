package com.uguryasar.gymprobetter.api.user;

import com.uguryasar.gymprobetter.data.model.api.GymProLoginResponse;
import com.uguryasar.gymprobetter.data.model.api.GymProMemberInfoResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserApi {

    // FIXME: @Body anotasyonu ile request nesnesi gönderilebiliyormuş.
    // https://code.tutsplus.com/tutorials/sending-data-with-retrofit-2-http-client-for-android--cms-27845
    @POST("/v1/Mobile/Login")
    @FormUrlEncoded
    Call<GymProLoginResponse> login(@Field("CompanyCode") String companyCode,
                                    @Field("UserName") String username,
                                    @Field("Password") String password,
                                    @Field("DeviceID") String deviceId,
                                    @Field("DeviceBrand") String deviceBrand,
                                    @Field("DeviceModel") String deviceModel,
                                    @Field("OsName") String osName,
                                    @Field("OsVersion") String  osVersion);

    @GET("/v1/Mobile/1/MemberInfo")
    Call<GymProMemberInfoResponse> getMemberInfo(@Header("Authorization") String token);

}
