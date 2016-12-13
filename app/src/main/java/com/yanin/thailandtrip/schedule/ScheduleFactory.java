package com.yanin.thailandtrip.schedule;

import com.yanin.thailandtrip.db.Schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFactory {

    public List<Schedule> getAllSchedules(){
        List<Schedule> schedules = new ArrayList<>();
        //day 1
        schedules.add(new Schedule(null, "飛去泰國～～～", "自行前往桃園機場",
                "2016-12-13 23:10", "2016-12-14 02:00", ScheduleConstants.TYPE_FLIGHT, "25.0796562", "121.2320283", "桃園機場",
                "",
                "https://c2.staticflickr.com/4/3192/2807870771_1253fc4bf4.jpg", 0));
        schedules.add(new Schedule(null, "機場睡覺 + 閒晃", "你已經在這裡了！！",
                "2016-12-14 02:00", "2016-12-14 10:00", ScheduleConstants.TYPE_FLIGHT, "13.6900043", "100.7479237", "Suvarnbhmi Airport",
                "辦網路、電話、換泰幣\n\n" +
                "http://bangkokgoplay.pixnet.net/blog/post/63780412",
                "https://c2.staticflickr.com/4/3192/2807870771_1253fc4bf4.jpg", 0));
        schedules.add(new Schedule(null, "BKK Unique Check in", "搭BTS",
                "2016-12-14 10:00", "2016-12-14 12:00", ScheduleConstants.TYPE_SITE_SEEING, "13.7593552", "100.5684153", "BKK Unique",
                "A) 蘇汪納蓬國際機場 (SUV)\n" +
                        ".... - 25分鐘抵達BKK Unique (跳表車資約250泰銖，另加機場排班費50泰銖)\n" +
                        ".... - 排班計程車在一樓外側\n" +
                        "\n" +
                        "B) 廊曼國際機場 (DMK)\n" +
                        ".... - 40分鐘抵達BKK Unique (跳表車資約350泰銖，另加機場排班費50泰銖)\n" +
                        ".... - 排班計程車在一樓外側\n" +
                        "A) 蘇汪納蓬機場捷運(Airport Rail Link)： Makkasan站轉搭地鐵至Phra Ram 9站\n" +
                        "- 直達車150泰銖，13分鐘。普通車35泰銖，22分鐘\n" +
                        "- 抵達Makkasan站後，接至地鐵Phetchaburi站，再轉搭地鐵至地鐵Phra Ram 9站 (只需一站)。\n" +
                        "如抵達時 間為早上8點至晚上8點期間，可撥打02-168-1050, 02-168-1058 或 087-344-9442。BKK Unique會派接駁車至地鐵Phra Ram 9站接您們。\n" +
                        "如超過此服務時間，需自行搭乘計程車或走路至民宿 (八分鐘)。\n" +
                        "\n" +
                        "B) 廊曼機場巴士 (A1線)： Chatuchak Park站轉搭地鐵至Phra Ram 9站\n" +
                        "- 巴士30泰銖，20分鐘抵達地鐵 - Chatuchak Park站\n" +
                        "- 抵達Chatuchak Park站後，搭地鐵至地鐵Phra Ram 9站。如抵達時間為早上8點至晚上8點期間，可撥打02-168-1050, 02-168-1058 或 087-344-9442。BKK Unique會派接駁車至地鐵Phra Ram 9站接您們。\n" +
                        "如超過此服務時間，需自行搭乘計程車或走路至民宿 (八分鐘)。\n" +
                        "*以上抵達方式不適合長者及小孩的旅客，因為要拖行李上下樓梯。",
                "", 0));
        schedules.add(new Schedule(null, "Terminal 21", "搭BTS到 Sukhumvi 站",
                "2016-12-14 12:00", "2016-12-14 15:00", ScheduleConstants.TYPE_SHOPPING, "13.7376599", "100.5603949", "Terminal 21",
                "",
                "http://static.asiawebdirect.com/m/bangkok/portals/bangkok-com/homepage/shopping-mall/terminal21/pagePropertiesImage/terminal-21-b.jpg", 0));
        schedules.add(new Schedule(null, "美功鐵道市集(Maeklong)", "搭BTS到 Victory Monument 站，之後的看網誌...",
                "2016-12-14 15:00", "2016-12-14 19:00", ScheduleConstants.TYPE_SHOPPING, "13.4109475", "99.9811779", "美功鐵道市集",
                "https://itravelblog.net/302/ \n" + "＊＊＊＊太晚就沒車可以回去喔＊＊＊＊\n單程每人約70Baht ，發車時間星期一到四5:30~20:00，五到日5:30~21:00，約 1.5 ～2小時可抵達。",
                "https://i.ytimg.com/vi/D4NMIXJzRwM/maxresdefault.jpg", 0));
        schedules.add(new Schedule(null, "After you 蜜糖吐司", "搭BTS到 Sukhumvi 站",
                "2016-12-14 20:30", "2016-12-14 22:00", ScheduleConstants.TYPE_SHOPPING, "13.7376599", "100.5603949", "Terminal 21",
                "",
                "https://farm4.staticflickr.com/3837/15098388260_6a7b2db06d_o.jpg", 0));
        schedules.add(new Schedule(null, "睡覺 打東東", "搭BTS",
                "2016-12-14 22:00", "2016-12-15 09:00", ScheduleConstants.TYPE_SLEEP, "13.7593552", "100.5684153", "BKK Unique",
                "",
                "http://sites.psu.edu/siowfa15/wp-content/uploads/sites/29639/2015/10/M_Id_401088_Kids_Sleep.jpg", 0));
        //day 2
        schedules.add(new Schedule(null, "Sompong Thai Cooking School", "搭BTS到 Chong Nongsi 站",
                "2016-12-15 09:00", "2016-12-15 12:00", ScheduleConstants.TYPE_PAID, "13.7237232", "100.527326", "Chong Nongsi",
                "集合地點：曼谷 BTS Chong Nongsi 站3號出口\n" +
                        "集合時間：9:15am\n" +
                        "行程長度：約 4 小時\n\n" +
                        "https://www.kkday.com/zh-tw/product/9789",
                "https://img.kkday.com/image/get/s1.kkday.com/product_9789/20160908030239_cM4Ue/jpeg", 910));
        schedules.add(new Schedule(null, "昭披耶河古蹟半日遊", "搭BTS到 Saphan Taksin 站，2號出口旁的中央碼頭搭船",
                "2016-12-15 13:00", "2016-12-15 18:30", ScheduleConstants.TYPE_SITE_SEEING, "13.7251224", "100.4789887", "Central Pier/Sathorn (Taksin) Yan Nawa Bangkok Thailand",
                "N8 : \n" +
                        "鄭王廟：在港口對岸，需再搭小船前往\n" +
                        "臥佛寺\n" +
                        "N9 : \n" +
                        "大皇宮\n" +
                        "玉佛寺",
                "http://userimage3.360doc.com/13/0222/10/8047853_201302221018140053.jpg", 0));
        schedules.add(new Schedule(null, "經濟入門夜遊選 - 昭披耶公主號", "搭船到Marine Department(N4)",
                "2016-12-15 19:00", "2016-12-15 22:00", ScheduleConstants.TYPE_PAID, "13.7307015","100.5111443", "Marine Department",
                "上船地點：曼谷、River City 1號碼頭。\n" +
                "航班：19:45。（請選「第一場」。）\n" +
                "報到時間：19:00-19:30。\n" +
                "航程時間：105分鐘-120分鐘。\n" +
                "用餐方式：國際自助百匯。\n\n" +
                "http://www.akhousebkk.com/font/ticket_item.php?ticket_id=14",
                "http://www.akhousebkk.com/plugin/travel/files/1472281601.jpg", 875));
        schedules.add(new Schedule(null, "睡覺 打東東", "搭BTS",
                "2016-12-15 22:00", "2016-12-16 08:00", ScheduleConstants.TYPE_SLEEP, "13.7593552", "100.5684153", "BKK Unique",
                "",
                "http://sites.psu.edu/siowfa15/wp-content/uploads/sites/29639/2015/10/M_Id_401088_Kids_Sleep.jpg", 0));

        //day 3
        schedules.add(new Schedule(null, "大城-世界文化遺產精選攻略一日遊", "搭BTS到 Chit Lom 站",
                "2016-12-16 08:30", "2016-12-16 17:30", ScheduleConstants.TYPE_PAID, "13.7440943", "100.5408605", "AK Travel門市",
                "出發時間 ：09:00am\n" +
                        "集合地點 ：AK Travel門市（BTS -Chit Lom）\n" +
                "閱讀曾經的輝煌．大城-世界文化遺產精選攻略一日遊（崖差蒙空寺Wat Yai Chaimongkhon +大城水上市場ayutthaya floatingmarket+涅槃寺Wat Lokaya Sutha+瑪哈泰寺Wat Mahathat+帕席桑碧寺＆帕蒙空博碧大皇宮Wat Phra Si Sanphet\n\n"
                + "http://www.akhousebkk.com/font/route_item.php?route_id=28",
                "http://www.akhousebkk.com/plugin/travel/files/1472238107.jpg", 1122));
        schedules.add(new Schedule(null, "河濱夜市", "Saphan Taksin站2號出口轉乘免費接駁船",
                "2016-12-16 18:00", "2016-12-16 22:00", ScheduleConstants.TYPE_SHOPPING, "13.7045112", "100.5008093", "Asiatique",
                "營業時間：pm17-am24(接駁船時間:pm16:00-pm23:30)\n\n" +
                "http://wkitty.pixnet.net/blog/post/33254353",
                "https://pic.pimg.tw/rebecca1003/1456755707-3809411692_n.jpg?v=1456756489", 0));
        schedules.add(new Schedule(null, "睡覺 打東東", "搭BTS",
                "2016-12-16 22:00", "2016-12-17 09:00", ScheduleConstants.TYPE_SLEEP, "13.7593552", "100.5684153", "BKK Unique",
                "",
                "http://sites.psu.edu/siowfa15/wp-content/uploads/sites/29639/2015/10/M_Id_401088_Kids_Sleep.jpg", 0));

        //day 4
        schedules.add(new Schedule(null, "洽圖洽市集", "搭BTS到 Mo chit站、chatuchak Part站",
                "2016-12-17 09:00", "2016-12-17 17:00", ScheduleConstants.TYPE_SHOPPING, "13.7999793", "100.5487116", "Chatuchak Market",
                "逛累了可以去旁邊的公園休息\n",
                "http://wherethailand.com/wp-content/uploads/2013/09/DSC4876_opt.jpeg", 0));
        schedules.add(new Schedule(null, "Bangkok Swing", "搭BTS到 Chong Nonsi站，再搭Taxi",
                "2016-12-17 18:00", "2016-12-17 22:00", ScheduleConstants.TYPE_SITE_SEEING, "13.7254936", "100.5194244", "The Hop Bangkok",
                "Just Dance!!",
                "http://2.bp.blogspot.com/-GJsR50HKIAc/UTpfjgqCQOI/AAAAAAAAAI8/sWnhgtXLDN8/s1600/dancing.jpg", 0));
        schedules.add(new Schedule(null, "睡覺 打東東", "搭BTS",
                "2016-12-17 22:00", "2016-12-18 09:00", ScheduleConstants.TYPE_SLEEP, "13.7593552", "100.5684153", "BKK Unique",
                "",
                "http://sites.psu.edu/siowfa15/wp-content/uploads/sites/29639/2015/10/M_Id_401088_Kids_Sleep.jpg", 0));
        //day 5
        schedules.add(new Schedule(null, "肥台灣去", "搭BTS到 Suvarnbhmi Airport站",
                "2016-12-18 17:50", "2016-12-18 22:25", ScheduleConstants.TYPE_FLIGHT, "13.6900043", "100.7479237", "Suvarnbhmi Airport",
                "",
                "https://c2.staticflickr.com/4/3192/2807870771_1253fc4bf4.jpg", 0));
        return schedules;
    }
}
