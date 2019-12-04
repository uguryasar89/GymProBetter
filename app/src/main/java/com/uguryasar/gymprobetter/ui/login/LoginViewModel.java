package com.uguryasar.gymprobetter.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Log;
import android.util.Patterns;

import com.uguryasar.gymprobetter.data.LoginRepository;
import com.uguryasar.gymprobetter.data.Result;
import com.uguryasar.gymprobetter.data.model.LoggedInUser;
import com.uguryasar.gymprobetter.R;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    public boolean login(String username, String password, String gymName) {
        // can be launched in a separate asynchronous job
        Result<LoggedInUser> result = loginRepository.login(username, password, gymName);

        if (result instanceof Result.Success) {
            LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
            loginResult.setValue(new LoginResult(new LoggedInUserView(data.getDisplayName())));
            return true;
        } else {
            loginResult.setValue(new LoginResult(R.string.login_failed));
        }
        return false;
    }

    public void loginDataChanged(String username, String password, String gymName) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password, null));
        } else if (!isGymNameValid(gymName)) {
            Log.i("Data valid", "gymName: " + gymName);
            loginFormState.setValue(new LoginFormState(null, null, R.string.invalid_gymName));
        } else {
            Log.i("Data valid", "true");
            loginFormState.setValue(new LoginFormState(true));
        }
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }

    // A placeholder gymName validation check
    private boolean isGymNameValid(String gymName) {
        return gymName != null && gymName.trim().length() > 3;
    }

}
