package com.yanin.thailandtrip;

import com.alamkanak.weekview.WeekViewEvent;
import com.yanin.thailandtrip.db.Schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class WeekViewEventConverter {

    private SimpleDateFormat dateFormat;

    public WeekViewEventConverter() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    }

    public WeekViewEvent convert(Schedule schedule){
        Calendar calendarStart = Calendar.getInstance();
        Calendar calendarEnd = Calendar.getInstance();
        try {
            calendarStart.setTime(dateFormat.parse(schedule.getStartTime()));
            calendarEnd.setTime(dateFormat.parse(schedule.getEndTime()));
        } catch (ParseException e) {
            throw new IllegalArgumentException("unexpected format : " + schedule);
        }

        return new WeekViewEvent(schedule.getId(), schedule.getTitle(), calendarStart, calendarEnd);
    }
}
