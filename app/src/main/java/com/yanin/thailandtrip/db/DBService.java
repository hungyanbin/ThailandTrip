package com.yanin.thailandtrip.db;

import android.content.Context;

import com.yanin.thailandtrip.ScheduleDao;

public interface DBService {

    void init(Context context);

    ScheduleDao getScheduleDao();
}
