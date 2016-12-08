package com.yanin.thailandtrip.schedule;

import java.util.List;

import io.reactivex.Single;

public interface ScheduleRepo {

    Single<List<Schedule>> loadAll();

    Single<Schedule> getById(long id);
}
