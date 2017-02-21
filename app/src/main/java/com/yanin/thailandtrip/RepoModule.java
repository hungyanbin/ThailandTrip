package com.yanin.thailandtrip;

import com.yanin.thailandtrip.db.ScheduleDao;
import com.yanin.thailandtrip.schedule.ScheduleRepo;
import com.yanin.thailandtrip.schedule.ScheduleRepoImp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class RepoModule {

    @Provides
    ScheduleRepo provideScheduleRepo(ScheduleDao scheduleDao){
        return new ScheduleRepoImp(scheduleDao);
    }
}
