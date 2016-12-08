package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.schedule.Schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFactory {

    public List<Schedule> getAllSchedules(){
        List<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule(0, "經濟入門夜遊選 - 昭披耶公主號", "搭船到Marine Department(N4)",
                "2016-12-15 19:00", "2016-12-15 22:00", "paid", "13.7307015","100.5111443", "Marine Department 1號碼頭",
                "上船地點：曼谷、River City 1號碼頭。\n" +
                "航班：19:45。（請選「第一場」。）\n" +
                "報到時間：19:00-19:30。\n" +
                "航程時間：105分鐘-120分鐘。\n" +
                "用餐方式：國際自助百匯。", 875));
        return schedules;
    }
}
