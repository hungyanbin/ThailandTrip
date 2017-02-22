package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.repository.ScheduleRepo;

import dagger.Module;
import dagger.Provides;

@Module
public class ScheduleModule {

    private ScheduleContract.View view;

    public ScheduleModule(ScheduleContract.View view) {
        this.view = view;
    }

    @Provides
    ScheduleContract.Presenter providePresenter(ScheduleRepo scheduleRepo){
        return new SchedulePresenter(view, scheduleRepo);
    }
}
