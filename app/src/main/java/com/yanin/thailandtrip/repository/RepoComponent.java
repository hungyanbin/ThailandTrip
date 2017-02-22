package com.yanin.thailandtrip.repository;

import com.yanin.thailandtrip.CalendarFragment;
import com.yanin.thailandtrip.db.DBComponent;
import com.yanin.thailandtrip.schedule.ScheduleFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies = DBComponent.class, modules = RepoModule.class)
public interface RepoComponent {
    void inject(CalendarFragment baseFragment);
    void inject(ScheduleFragment scheduleFragment);
}
