package org.linlinjava.litemall.db.vo;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Mino
 * @Date 2020/6/15 17:23
 * @Describe
 */
public class LitemallTeamCourseDetailVO {

    private Date beginTime;
    private Date endTime;
    private String courseName;
    private String courseType;
    private String trainerName;
    private String courseDesc;
    private String maxCount;
    private String picUrl;

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(String maxCount) {
        this.maxCount = maxCount;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
