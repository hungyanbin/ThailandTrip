package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.db.Schedule;
import com.yanin.thailandtrip.db.ScheduleDao;

import java.util.List;

import io.reactivex.Single;

public class ScheduleRepoImp implements ScheduleRepo{

    private ScheduleDao scheduleDao;

    public ScheduleRepoImp(ScheduleDao scheduleDao) {
        this.scheduleDao = scheduleDao;
    }

    @Override
    public Single<List<Schedule>> loadAll() {
        return Single.just(hasItem())
                .map(this::getItems);
    }

    private boolean hasItem(){
        long count = scheduleDao.count();
        return count != 0;
    }

    private List<Schedule> getItems(boolean hasItem){
        if(hasItem){
            return scheduleDao.loadAll();
        }else{
            ScheduleFactory scheduleFactory = new ScheduleFactory();
            List<Schedule> schedules = scheduleFactory.getAllSchedules();
            scheduleDao.insertInTx(schedules);
            return scheduleDao.loadAll();
        }
    }

    @Override
    public Single<Schedule> getById(long id) {
        return Single.just(scheduleDao.load(id));
    }
}
