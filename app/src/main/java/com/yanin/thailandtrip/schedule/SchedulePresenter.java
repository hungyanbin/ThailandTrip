package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.repository.ScheduleRepo;

public class SchedulePresenter implements ScheduleContract.Presenter{

    private ScheduleContract.View view;
    private ScheduleRepo scheduleRepo;

    public SchedulePresenter(ScheduleContract.View view, ScheduleRepo scheduleRepo) {
        this.view = view;
        this.scheduleRepo = scheduleRepo;
    }

    @Override
    public void onStart(long scheduleId) {
        scheduleRepo.getById(scheduleId)
                .subscribe(view::show);
    }
}
