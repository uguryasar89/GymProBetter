package com.uguryasar.gymprobetter.data;

import android.util.Log;

import com.google.gson.Gson;
import com.uguryasar.gymprobetter.api.user.UserApi;
import com.uguryasar.gymprobetter.api.util.GymProApiUtil;
import com.uguryasar.gymprobetter.data.model.LoggedInUser;
import com.uguryasar.gymprobetter.data.model.api.GymProLoginResponse;
import com.uguryasar.gymprobetter.data.model.api.GymProMemberInfoResponse;

import java.io.IOException;
import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.HTTP;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password, String gymName) {

        try {

            UserApi service = GymProApiUtil.getAPIService();
            Response<GymProLoginResponse> loginResponse = service.login("TEKNOSPORTS",
                    "uguryasar89@gmail.com",
                    "131223",
                    "7a20e6ced49b9c13",
                    "Sony",
                    "D6503",
                    "Android",
                    "6.0.1")
                    .execute();

            if (HttpURLConnection.HTTP_OK == loginResponse.code()) {
                if (loginResponse.body().getIsSuccessful()) {
                    GymProMemberInfoResponse memberInfo = getMemberInfo("Bearer " + loginResponse.body().getData().getAccessToken());

                    LoggedInUser user = new LoggedInUser(
                            memberInfo.getData().getMemberID().toString(),
                            memberInfo.getData().getFirstName() + " " + memberInfo.getData().getLastName());
                    return new Result.Success<>(user);

                } else {
                    return new Result.Error(new IOException("Oturum açılamadı. " + loginResponse.body().getErrorMessage()));
                }
            } else {
                new Result.Error(new IOException("Oturum açılamadı. Detay: " + new Gson().toJson(loginResponse.body())));
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }

        return new Result.Error(new IOException("Oturum açılamadı."));
    }

    public void logout() {
        // TODO: revoke authentication
    }

    public GymProMemberInfoResponse getMemberInfo(String token) throws IOException {
        return GymProApiUtil.getAPIService().getMemberInfo(token).execute().body();
    }
}
