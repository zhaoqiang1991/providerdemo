package com.example.module;

import com.example.api.IHome;


public class HomeService implements IHome {
    private static final String TAG = HomeService.class.getSimpleName();

    @Override
    public String show() {
        return "I am HomeService ";
    }
}