package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.LitemallAppointmentMapper;
import org.linlinjava.litemall.db.domain.LitemallAppointment;
import org.linlinjava.litemall.db.domain.LitemallAppointmentExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author Mino
 * @Date 2020/6/18 17:38
 * @Describe
 */
@Service
public class LitemallAppointmentService {

    @Resource
    private LitemallAppointmentMapper appointmentMapper;

    public int add(LitemallAppointment appointment) {
        appointment.setDeleted(false);
        appointment.setStatus("0");
        appointment.setAddTime(LocalDateTime.now());
        appointment.setUpdateTime(LocalDateTime.now());
        return appointmentMapper.insertSelective(appointment);
    }

    public long appointmentCount(Integer userId, String status) {
        LitemallAppointmentExample example = new LitemallAppointmentExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false).andStatusEqualTo(status);
        return appointmentMapper.countByExample(example);
    }

    public List<LitemallAppointment> selectByUserIdAndStatus(Integer userId, String status) {
        LitemallAppointmentExample example = new LitemallAppointmentExample();
        if (StringUtils.isEmpty(status)) {
            example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        } else {
            example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false).andStatusEqualTo(status);
        }
        return appointmentMapper.selectByExample(example);
    }


}
