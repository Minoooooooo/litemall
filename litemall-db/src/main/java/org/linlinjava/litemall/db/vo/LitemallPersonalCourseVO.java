package org.linlinjava.litemall.db.vo;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Mino
 * @Date 2020/6/15 17:23
 * @Describe
 */
public class LitemallPersonalCourseVO {

    private int courseId;
    private String courseName;
    private String courseType;
    private String trainerName;
    private String courseDesc;
    private BigDecimal coursePrice;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
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
