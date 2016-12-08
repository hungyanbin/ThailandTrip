package com.yanin.thailandtrip;

public class Schedule {

    private long id;
    private String title;
    private String transport;
    private String startTime;
    private String endTime;
    private String type;
    private String latitude;
    private String longitude;
    private String location;
    private String note;
    private double money;

    public Schedule(long id, String title, String transport, String startTime, String endTime, String type,
                    String latitude, String longitude, String location, String note, double money) {
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
        this.money = money;
    }

    public long getId() {
        return id;
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
}
