package com.yanin.thailandtrip.repository;

import com.yanin.thailandtrip.db.ScheduleDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepoModule {

    @Singleton
    @Provides
    ScheduleRepo provideScheduleRepo(ScheduleDao scheduleDao){
        return new ScheduleRepoImp(scheduleDao);
    }
}
