package com.uguryasar.gymprobetter.ui.login;

import androidx.annotation.Nullable;

/**
 * Data validation state of the login form.
 */
class LoginFormState {
    @Nullable
    private Integer usernameError;
    @Nullable
    private Integer passwordError;
    @Nullable
    private Integer gymNameError;
    private boolean isDataValid;

    LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError, @Nullable Integer gymNameError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.gymNameError = gymNameError;
        this.isDataValid = false;
    }

    LoginFormState(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.gymNameError = null;
        this.isDataValid = isDataValid;
    }

    @Nullable
    Integer getUsernameError() {
        return usernameError;
    }

    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    @Nullable
    Integer getGymNameError() { return gymNameError; }

    boolean isDataValid() {
        return isDataValid;
    }
}
