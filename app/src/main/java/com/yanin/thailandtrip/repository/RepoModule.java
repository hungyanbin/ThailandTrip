package com.yanin.thailandtrip.repository;

import com.yanin.thailandtrip.db.ScheduleDao;

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
