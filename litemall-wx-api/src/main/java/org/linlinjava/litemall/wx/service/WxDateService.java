package org.linlinjava.litemall.wx.service;

import org.linlinjava.litemall.core.util.DateTimeUtil;
import org.linlinjava.litemall.wx.dto.WeekDateInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Mino
 * @Date 2020/6/22 15:33
 * @Describe
 */
@Service
public class WxDateService {

    /**
     * 默认组装7天数据
     */
    private static final int dateNum = 7;

    public List<WeekDateInfo> findWeekDate() {
        List<WeekDateInfo> daysList = new ArrayList<>();
        for (int i = 0; i < dateNum; i++) {
            WeekDateInfo dateInfo = new WeekDateInfo();
            Date fetureDate = DateTimeUtil.getFetureDate(i);
            dateInfo.setDate(DateTimeUtil.dateToString(fetureDate, DateTimeUtil.STRING_FORMART4));
            dateInfo.setWeekInfo(DateTimeUtil.getWeek(fetureDate));
        }
        return daysList;
    }

}
