package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.db.Schedule;

public interface ScheduleContract {

    interface Presenter{
        void onStart(long scheduleId);
    }

    interface View{
        void show(Schedule schedule);
    }
}
