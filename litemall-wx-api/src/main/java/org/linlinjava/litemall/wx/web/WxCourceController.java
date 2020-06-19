package org.linlinjava.litemall.wx.web;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.DateTimeUtil;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.LitemallSystem;
import org.linlinjava.litemall.db.service.LitemallCourseService;
import org.linlinjava.litemall.db.service.LitemallSystemConfigService;
import org.linlinjava.litemall.db.vo.LitemallPersonalCourseVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseDetailVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 场馆信息
 */
@RestController
@RequestMapping("/wx/course")
@Validated
public class WxCourceController {
    private final Log logger = LogFactory.getLog(WxCourceController.class);

    @Autowired
    private LitemallSystemConfigService systemConfigService;
    @Autowired
    private LitemallCourseService courseService;

    /**
     * 查询团课详情信息
     *
     * @param id
     * @return
     */
    @GetMapping("teamCourseDetail")
    public Object teamCourseDetail(int id) {
        // 注意事项
        List<LitemallSystem> announcements = systemConfigService.listKeyName("litemall_announcements");
        // 团课信息
        LitemallTeamCourseDetailVO courseDetailVO = courseService.selectCourseDetailByPrimaryKey(id);

        Map<String, Object> data = new HashMap<>(2);
        data.put("announcements", announcements);
        data.put("courseDetail", courseDetailVO);
        logger.info("teamCourseDetail,id:" + id + ",result:" + JSON.toJSONString(data));
        return ResponseUtil.ok(data);
    }



}
