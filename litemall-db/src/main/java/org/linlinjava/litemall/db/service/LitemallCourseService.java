package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.LitemallCourseMapper;
import org.linlinjava.litemall.db.vo.LitemallPersonalCourseVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseDetailVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Mino
 * @Date 2020/6/15 11:15
 * @Describe
 */
@Service
public class LitemallCourseService {

    @Resource
    private LitemallCourseMapper courseMapper;

    /**
     * 查询当天团课信息
     *
     * @return
     */
    public List<LitemallTeamCourseVO> listCourseToday(String date) {
        Map<String, Object> paramMap = new HashMap<>(1);
        paramMap.put("date", date);
        return courseMapper.selectTodayCourseByBeginTime(paramMap);
    }

    /**
     * 查询团课详细信息
     *
     * @return
     */
    public LitemallTeamCourseDetailVO selectCourseDetailByPrimaryKey(int id) {
        Map<String, Object> paramMap = new HashMap<>(1);
        paramMap.put("id", id);
        return courseMapper.selectCourseDetailByPrimaryKey(paramMap);
    }

    /**
     * 查询私教课程信息
     *
     * @return
     */
    public List<LitemallPersonalCourseVO> selectPersonalCourse() {
        return courseMapper.selectPersonalCourse();
    }

}
