package com.yanin.thailandtrip;

import com.yanin.thailandtrip.schedule.ScheduleRepo;
import com.yanin.thailandtrip.schedule.ScheduleRepoImp;

public class RepoFactory {

    public static ScheduleRepo getScheduleRepo(){
        return new ScheduleRepoImp();
    }
}
