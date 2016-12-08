package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.RepoFactory;

public class SchedulePresenter implements ScheduleContract.Presenter{

    private ScheduleContract.View view;
    private ScheduleRepo scheduleRepo;

    public SchedulePresenter(ScheduleContract.View view) {
        this.view = view;
        scheduleRepo = RepoFactory.getScheduleRepo();
    }

    @Override
    public void onStart(long scheduleId) {
        scheduleRepo.getById(scheduleId)
                .subscribe(view::show);
    }
}
