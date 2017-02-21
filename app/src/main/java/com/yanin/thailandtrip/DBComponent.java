package com.yanin.thailandtrip;

import com.yanin.thailandtrip.db.ScheduleDao;

import dagger.Component;

@Component(modules = DBModule.class)
public interface DBComponent {
    ScheduleDao getScheduleDao();
}
