package com.yanin.thailandtrip;

import android.app.Application;

import com.yanin.thailandtrip.db.DBService;

public class TripApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DBService dbService = ServiceFactory.getDBService();
        dbService.init(this);
    }
}
