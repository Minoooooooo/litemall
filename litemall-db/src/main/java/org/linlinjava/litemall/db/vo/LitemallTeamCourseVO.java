package org.linlinjava.litemall.db.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.JSON;

/**
 * @Author Mino
 * @Date 2020/6/15 17:23
 * @Describe
 */
public class LitemallTeamCourseVO {

    private int courseId;
    private Date beginTime;
    private Date endTime;
    private String courseName;
    private String courseType;
    private String trainerName;
    private String maxCount;
    private BigDecimal coursePrice;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

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

    public BigDecimal getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(BigDecimal coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
