package com.example.module;

import com.example.api.ILogin;

public class LoginService implements ILogin {
    @Override
    public boolean login(String userName, String passport) {
        if (userName.equals("xxx") && passport.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}