package com.yanin.thailandtrip;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFactory {

    public List<Schedule> getAllSchedules(){
        List<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule(0, "鄭王廟", "搭船", "2016-12-14 12:30", "2016-12-14 13:30", "free"));
        return schedules;
    }
}
