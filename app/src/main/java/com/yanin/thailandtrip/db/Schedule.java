package com.yanin.thailandtrip.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Schedule {

    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String transport;
    @NotNull
    private String startTime;
    @NotNull
    private String endTime;
    @NotNull
    private String type;
    private String latitude;
    private String longitude;
    private String location;
    private String note;
    private String imageUrl;
    private double money;


    @Generated(hash = 1697869518)
    public Schedule(Long id, @NotNull String title, @NotNull String transport,
            @NotNull String startTime, @NotNull String endTime,
            @NotNull String type, String latitude, String longitude,
            String location, String note, String imageUrl, double money) {
        this.id = id;
        this.title = title;
        this.transport = transport;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.note = note;
        this.imageUrl = imageUrl;
        this.money = money;
    }

    @Generated(hash = 729319394)
    public Schedule() {
    }
    

    public String getTitle() {
        return title;
    }

    public String getTransport() {
        return transport;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getType() {
        return type;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", transport='").append(transport).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
