package com.yanin.thailandtrip.framework;

import android.app.Application;

import com.yanin.thailandtrip.GlobalProvider;


public class TripApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GlobalProvider.init(getApplicationContext());
    }
}
