package com.yanin.thailandtrip.db;

import android.content.Context;

public class DBServiceImp implements DBService {

    private static final String DB_NAME = "trip.db";
    private DaoSession daoSession;

    @Override
    public void init(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);

        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());

        daoSession = daoMaster.newSession();
    }

    @Override
    public ScheduleDao getScheduleDao() {
        return daoSession.getScheduleDao();
    }
}
