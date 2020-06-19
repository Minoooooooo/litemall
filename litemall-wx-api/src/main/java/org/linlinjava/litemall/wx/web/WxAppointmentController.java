package org.linlinjava.litemall.wx.web;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.LitemallAppointment;
import org.linlinjava.litemall.db.service.LitemallAppointmentService;
import org.linlinjava.litemall.wx.annotation.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 场馆信息
 */
@RestController
@RequestMapping("/wx/appointment")
@Validated
public class WxAppointmentController {
    private final Log logger = LogFactory.getLog(WxAppointmentController.class);

    @Autowired
    private LitemallAppointmentService appointmentService;

    /**
     * 保存预约信息
     *
     * @param userId
     * @param appointment
     * @return
     */
    @PostMapping("save")
    public Object save(@LoginUser Integer userId, @RequestBody LitemallAppointment appointment) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        Object error = validate(appointment);
        if (error != null) {
            return error;
        }
        appointmentService.add(appointment);
        // 短信通知客户预约成功，通知客服客户预约  TODO

        return ResponseUtil.ok(appointment.getId());
    }

    /**
     * 预约统计
     *
     * @param userId
     * @return
     */
    @GetMapping("appointmentCount")
    public Object appointmentCount(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        // 已预约
        long bookingCount = appointmentService.appointmentCount(userId, "0");
        // 已结束
        long endingCount = appointmentService.appointmentCount(userId, "1");
        Map<String, Object> data = new HashMap<>(2);
        data.put("bookingCount", bookingCount);
        data.put("endingCount", endingCount);
        logger.info("appointmentCount,userId:" + userId + ",result:" + JSON.toJSONString(data));
        return ResponseUtil.ok(data);

    }

    /**
     * 预约列表
     *
     * @param userId
     * @return
     */
    @GetMapping("appointmentList")
    public Object appointmentList(@LoginUser Integer userId, String status) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        List<LitemallAppointment> appointmentList = appointmentService.selectByUserIdAndStatus(userId, status);
        Map<String, Object> data = new HashMap<>(2);
        data.put("appointmentList", appointmentList);
        logger.info("appointmentList" +
                ",userId:" + userId + ",result:" + JSON.toJSONString(data));
        return ResponseUtil.ok(data);

    }

    private Object validate(LitemallAppointment appointment) {
        Integer userId = appointment.getUserId();
        if (null == userId) {
            return ResponseUtil.badArgument();
        }
        String phone = appointment.getPhone();
        if (StringUtils.isEmpty(phone)) {
            return ResponseUtil.badArgument();
        }
        Integer courseType = appointment.getCourseType();
        if (null == courseType) {
            return ResponseUtil.badArgument();
        }
        Integer courseId = appointment.getCourseId();
        if (null == courseId) {
            return ResponseUtil.badArgument();
        }
        return null;
    }


}
