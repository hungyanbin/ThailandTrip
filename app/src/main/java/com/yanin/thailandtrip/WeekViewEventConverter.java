package com.yanin.thailandtrip;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.alamkanak.weekview.WeekViewEvent;
import com.yanin.thailandtrip.db.Schedule;
import com.yanin.thailandtrip.schedule.ScheduleConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class WeekViewEventConverter {

    private SimpleDateFormat dateFormat;
    private Context context;

    public WeekViewEventConverter(Context context) {
        this.context = context;
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

        int colorRes = 0;
        String type = schedule.getType();
        if(type.equals(ScheduleConstants.TYPE_FLIGHT)){
            colorRes = R.color.color_flight;
        }else if(type.equals(ScheduleConstants.TYPE_PAID)){
            colorRes = R.color.color_paid;
        }else if(type.equals(ScheduleConstants.TYPE_SHOPPING)){
            colorRes = R.color.color_shopping;
        }else if(type.equals(ScheduleConstants.TYPE_SITE_SEEING)){
            colorRes = R.color.color_siteSeeing;
        }else if(type.equals(ScheduleConstants.TYPE_SLEEP)){
            colorRes = R.color.color_sleep;
        }

        WeekViewEvent weekViewEvent = new WeekViewEvent(schedule.getId(), schedule.getTitle(), calendarStart, calendarEnd);
        weekViewEvent.setColor(ContextCompat.getColor(context, colorRes));
        return weekViewEvent;
    }
}
