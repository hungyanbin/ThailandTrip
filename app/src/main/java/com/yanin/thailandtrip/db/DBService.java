package com.yanin.thailandtrip.db;

import android.content.Context;

import com.yanin.thailandtrip.schedule.ScheduleDao;

public interface DBService {

    void init(Context context);


    ScheduleDao getScheduleDao();
}
