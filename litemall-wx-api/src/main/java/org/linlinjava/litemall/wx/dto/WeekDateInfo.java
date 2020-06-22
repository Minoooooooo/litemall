package org.linlinjava.litemall.wx.dto;

import com.alibaba.fastjson.JSON;

public class WeekDateInfo {

    private String date;
    private String weekInfo;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekInfo() {
        return weekInfo;
    }

    public void setWeekInfo(String weekInfo) {
        this.weekInfo = weekInfo;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
