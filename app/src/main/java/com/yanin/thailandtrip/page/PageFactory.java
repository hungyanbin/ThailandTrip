package com.yanin.thailandtrip.page;

import com.yanin.thailandtrip.BaseFragment;
import com.yanin.thailandtrip.ScheduleFragment;

import java.io.Serializable;

public class PageFactory {

    public static class SchedulePage extends Page implements Serializable{

        private long scheduleId;

        public SchedulePage(long scheduleId) {
            this.scheduleId = scheduleId;
        }

        @Override
        public BaseFragment getFragment() {
            return ScheduleFragment.newInstance(scheduleId);
        }
    }
}
