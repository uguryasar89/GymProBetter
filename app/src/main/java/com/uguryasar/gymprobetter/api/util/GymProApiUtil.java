package com.uguryasar.gymprobetter.api.util;

import com.uguryasar.gymprobetter.api.client.RetrofitClient;
import com.uguryasar.gymprobetter.api.user.UserApi;

public class GymProApiUtil {

    private GymProApiUtil() {}

    public static final String BASE_URL = "https://api.fitnessonline.net\n";

    public static UserApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(UserApi.class);
    }

}
