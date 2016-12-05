package com.yanin.thailandtrip;

public class Schedule {

    private long id;
    private String title;
    private String transport;
    private String startTime;
    private String endTime;
    private String type;

    public Schedule(long id, String title, String transport, String startTime, String endTime, String type) {
        this.id = id;
        this.title = title;
        this.transport = transport;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", transport='").append(transport).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
