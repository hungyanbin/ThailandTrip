package com.yanin.thailandtrip.page;

import com.yanin.thailandtrip.CalendarFragment;
import com.yanin.thailandtrip.framework.BaseFragment;
import com.yanin.thailandtrip.images.FullImageFragment;
import com.yanin.thailandtrip.images.ImagesFragment;
import com.yanin.thailandtrip.schedule.ScheduleFragment;

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

    public static class ImagesPage extends Page implements Serializable{

        @Override
        public BaseFragment getFragment() {
            return ImagesFragment.newInstance();
        }
    }

    public static class CalendarPage extends Page implements Serializable{

        @Override
        public BaseFragment getFragment() {
            return CalendarFragment.newInstance();
        }
    }

    public static class FullImagePage extends Page implements Serializable{

        String url;

        public FullImagePage(String url) {
            this.url = url;
        }

        @Override
        public BaseFragment getFragment() {
            return FullImageFragment.newInstance(url);
        }
    }

}
