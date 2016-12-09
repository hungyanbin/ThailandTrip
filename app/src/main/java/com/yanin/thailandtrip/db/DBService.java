package com.yanin.thailandtrip.db;

import android.content.Context;

public interface DBService {

    void init(Context context);


    ScheduleDao getScheduleDao();
}
