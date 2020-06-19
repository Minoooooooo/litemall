package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.LitemallSystemMapper;
import org.linlinjava.litemall.db.domain.LitemallSystem;
import org.linlinjava.litemall.db.domain.LitemallSystemExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LitemallSystemConfigService {
    @Resource
    private LitemallSystemMapper systemMapper;

    public Map<String, String> queryAll() {
        LitemallSystemExample example = new LitemallSystemExample();
        example.or().andDeletedEqualTo(false);

        List<LitemallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> systemConfigs = new HashMap<>();
        for (LitemallSystem item : systemList) {
            systemConfigs.put(item.getKeyName(), item.getKeyValue());
        }

        return systemConfigs;
    }

    /**
     * 后台查询门店相关配置信息
     * @return
     */
    public Map<String, String> listMail() {
        LitemallSystemExample example = new LitemallSystemExample();
        example.or().andKeyNameLike("litemall_mall_%").andDeletedEqualTo(false);
        List<LitemallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for (LitemallSystem system : systemList) {
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    /**
     * KayName相关配置信息
     * @return
     */
    public List<LitemallSystem> listKeyName(String keyName) {
        LitemallSystemExample example = new LitemallSystemExample();
        LitemallSystemExample.Criteria criteria = example.createCriteria();

        criteria.andDeletedEqualTo(false);
        if(!StringUtils.isEmpty(keyName)){
            criteria.andKeyNameEqualTo(keyName);
        }
        example.setOrderByClause("sort_order" + " " + "asc");
        return systemMapper.selectByExample(example);
    }

    public Map<String, String> listWx() {
        LitemallSystemExample example = new LitemallSystemExample();
        example.or().andKeyNameLike("litemall_wx_%").andDeletedEqualTo(false);
        List<LitemallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for (LitemallSystem system : systemList) {
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listOrder() {
        LitemallSystemExample example = new LitemallSystemExample();
        example.or().andKeyNameLike("litemall_order_%").andDeletedEqualTo(false);
        List<LitemallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for (LitemallSystem system : systemList) {
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listExpress() {
        LitemallSystemExample example = new LitemallSystemExample();
        example.or().andKeyNameLike("litemall_express_%").andDeletedEqualTo(false);
        List<LitemallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for (LitemallSystem system : systemList) {
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public void updateConfig(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            LitemallSystemExample example = new LitemallSystemExample();
            example.or().andKeyNameEqualTo(entry.getKey()).andDeletedEqualTo(false);

            LitemallSystem system = new LitemallSystem();
            system.setKeyName(entry.getKey());
            system.setKeyValue(entry.getValue());
            system.setUpdateTime(LocalDateTime.now());
            systemMapper.updateByExampleSelective(system, example);
        }

    }

    public void addConfig(String key, String value, short sortOrder) {
        LitemallSystem system = new LitemallSystem();
        system.setKeyName(key);
        system.setKeyValue(value);
        system.setAddTime(LocalDateTime.now());
        system.setUpdateTime(LocalDateTime.now());
        system.setSortOrder(sortOrder);
        systemMapper.insertSelective(system);
    }
}
