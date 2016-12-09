package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.db.Schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFactory {

    public List<Schedule> getAllSchedules(){
        List<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule(null, "經濟入門夜遊選 - 昭披耶公主號", "搭船到Marine Department(N4)",
                "2016-12-15 19:00", "2016-12-15 22:00", "paid", "13.7307015","100.5111443", "Marine Department 1號碼頭",
                "上船地點：曼谷、River City 1號碼頭。\n" +
                "航班：19:45。（請選「第一場」。）\n" +
                "報到時間：19:00-19:30。\n" +
                "航程時間：105分鐘-120分鐘。\n" +
                "用餐方式：國際自助百匯。",
                "http://www.akhousebkk.com/plugin/travel/files/1472281601.jpg", 875));
        schedules.add(new Schedule(null, "Sompong Thai Cooking School", "搭BTS到 Chong Nongsi 站",
                "2016-12-15 09:00", "2016-12-15 12:00", "paid", "13.7237232", "100.527326", "Chong Nongsi 站3號出口",
                "集合地點：曼谷 BTS Chong Nongsi 站3號出口\n" +
                        "集合時間：9:15am\n" +
                        "行程長度：約 4 小時",
                "https://img.kkday.com/image/get/s1.kkday.com/product_9789/20160908030239_cM4Ue/jpeg", 910));
        schedules.add(new Schedule(null, "大城-世界文化遺產精選攻略一日遊", "搭BTS到 Chit Lom 站",
                "2016-12-16 08:30", "2016-12-16 17:30", "paid", "13.7440943", "100.5408605", "AK Travel門市",
                "出發時間 ：09:00am\n" +
                        "集合地點 ：AK Travel門市（BTS -Chit Lom）",
                "http://www.akhousebkk.com/plugin/travel/files/1472238107.jpg", 1122));
        schedules.add(new Schedule(null, "昭披耶河古蹟半日遊", "搭BTS到 Saphan Taksin 站，2號出口旁的中央碼頭搭船",
                "2016-12-15 13:00", "2016-12-15 18:30", "free", "13.7251224", "100.4789887", "Sathorn Pier",
                "N8 : \n" +
                        "鄭王廟：在港口對岸，需再搭小船前往\n" +
                        "臥佛寺\n" +
                        "N9 : \n" +
                        "大皇宮\n" +
                        "玉佛寺",
                "http://userimage3.360doc.com/13/0222/10/8047853_201302221018140053.jpg", 0));
        schedules.add(new Schedule(null, "瑪頭夜市", "Saphan Taksin站2號出口轉乘免費接駁船",
                "2016-12-16 18:00", "2016-12-16 22:00", "free", "13.7045112", "100.5008093", "瑪頭夜市",
                "營業時間：pm17-am24(接駁船時間:pm16:00-pm23:30)\"  ",
                "https://pic.pimg.tw/rebecca1003/1456755707-3809411692_n.jpg?v=1456756489", 0));
        return schedules;
    }
}
