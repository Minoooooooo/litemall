package org.linlinjava.litemall.wx.web;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.DateTimeUtil;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.LitemallCategory;
import org.linlinjava.litemall.db.domain.LitemallSystem;
import org.linlinjava.litemall.db.service.LitemallCategoryService;
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
 * 类目服务
 */
@RestController
@RequestMapping("/wx/catalog")
@Validated
public class WxCatalogController {
    private final Log logger = LogFactory.getLog(WxCatalogController.class);

    @Autowired
    private LitemallCategoryService categoryService;
    @Autowired
    private LitemallCourseService courseService;
    @Autowired
    private LitemallSystemConfigService systemConfigService;


    /**
     * 目录信息
     *
     * @return
     */
    @GetMapping("index")
    public Object index() {

        // 目录信息
        List<LitemallCategory> l1CatList = categoryService.queryL1();
        // 团课信息 默认今天的团课信息
        String date = DateTimeUtil.dateToString(new Date(), DateTimeUtil.STRING_FORMART3);
        List<LitemallTeamCourseVO> course = courseService.listCourseToday(date);

        Map<String, Object> data = new HashMap<>(2);
        data.put("categoryList", l1CatList);
        data.put("Teamcourse", course);
        return ResponseUtil.ok(data);
    }

    /**
     * 目录切换
     *
     * @return
     */
    @GetMapping("venue")
    public Object venue(Integer id) {
        Map<String, Object> data = new HashMap<>();
        // 课程
        if (id.toString().startsWith("1")) {
            // 团课
            if (id == 1000001) {
                String date = DateTimeUtil.dateToString(new Date(), DateTimeUtil.STRING_FORMART3);
                List<LitemallTeamCourseVO> course = courseService.listCourseToday(date);
                data.put("course", course);
                logger.info("teamCourse,result:" + JSON.toJSONString(data));
            }
            // 私教课程
            if (id == 1000002) {
                List<LitemallPersonalCourseVO> personalCourseVO = courseService.selectPersonalCourse();
                data.put("course", personalCourseVO);
                logger.info("personalCourse,result:" + JSON.toJSONString(data));
            }
        } else if (id.toString().startsWith("2")) {
            //场馆
            LitemallCategory categories = categoryService.queryByPrimaryKey(id);
            data.put("venue", categories);
        }
        // 注意事项
        List<LitemallSystem> announcements = systemConfigService.listKeyName("litemall_announcements");
        data.put("announcements", announcements);
        logger.info("WxCatalogController,venue,id," + id + "result:" + JSON.toJSONString(data));
        return ResponseUtil.ok(data);
    }


}
