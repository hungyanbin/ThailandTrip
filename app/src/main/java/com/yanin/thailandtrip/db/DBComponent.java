package com.yanin.thailandtrip.db;

import dagger.Component;

@Component(modules = DBModule.class)
public interface DBComponent {
    ScheduleDao getScheduleDao();
}
