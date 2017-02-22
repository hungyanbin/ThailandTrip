package com.yanin.thailandtrip.db;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class DBModule {

    private static final String DB_NAME = "trip.db";
    private DaoSession daoSession;

    public DBModule(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);

        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());

        daoSession = daoMaster.newSession();
    }

    @Provides
    public ScheduleDao getScheduleDao() {
        return daoSession.getScheduleDao();
    }
}
