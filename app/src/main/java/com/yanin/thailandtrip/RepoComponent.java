package com.yanin.thailandtrip;

import com.yanin.thailandtrip.schedule.ScheduleFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies = DBComponent.class, modules = RepoModule.class)
public interface RepoComponent {
    void inject(CalendarFragment baseFragment);
    void inject(ScheduleFragment scheduleFragment);
}
