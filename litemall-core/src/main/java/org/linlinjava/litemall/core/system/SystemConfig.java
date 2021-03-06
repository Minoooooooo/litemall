package org.linlinjava.litemall.core.system;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统设置
 */
public class SystemConfig {
    // 小程序相关配置
    public final static String LITEMALL_WX_INDEX_NEW = "litemall_wx_index_new";
    public final static String LITEMALL_WX_INDEX_HOT = "litemall_wx_index_hot";
    public final static String LITEMALL_WX_INDEX_BRAND = "litemall_wx_index_brand";
    public final static String LITEMALL_WX_INDEX_TOPIC = "litemall_wx_index_topic";
    public final static String LITEMALL_WX_INDEX_CATLOG_LIST = "litemall_wx_catlog_list";
    public final static String LITEMALL_WX_INDEX_CATLOG_GOODS = "litemall_wx_catlog_goods";
    public final static String LITEMALL_WX_SHARE = "litemall_wx_share";
    // 运费相关配置
    public final static String LITEMALL_EXPRESS_FREIGHT_VALUE = "litemall_express_freight_value";
    public final static String LITEMALL_EXPRESS_FREIGHT_MIN = "litemall_express_freight_min";
    // 订单相关配置
    public final static String LITEMALL_ORDER_UNPAID = "litemall_order_unpaid";
    public final static String LITEMALL_ORDER_UNCONFIRM = "litemall_order_unconfirm";
    public final static String LITEMALL_ORDER_COMMENT = "litemall_order_comment";
    // 商场相关配置 不设置缓存中便于及时更新

    //所有的配置均保存在该 HashMap 中
    private static Map<String, String> SYSTEM_CONFIGS = new HashMap<>();

    private static String getConfig(String keyName) {
        return SYSTEM_CONFIGS.get(keyName);
    }

    private static Integer getConfigInt(String keyName) {
        return Integer.parseInt(SYSTEM_CONFIGS.get(keyName));
    }

    private static Boolean getConfigBoolean(String keyName) {
        return Boolean.valueOf(SYSTEM_CONFIGS.get(keyName));
    }

    private static BigDecimal getConfigBigDec(String keyName) {
        return new BigDecimal(SYSTEM_CONFIGS.get(keyName));
    }

    public static Integer getNewLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_NEW);
    }

    public static Integer getHotLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_HOT);
    }

    public static Integer getBrandLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_BRAND);
    }

    public static Integer getTopicLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_TOPIC);
    }

    public static Integer getCatlogListLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_CATLOG_LIST);
    }

    public static Integer getCatlogMoreLimit() {
        return getConfigInt(LITEMALL_WX_INDEX_CATLOG_GOODS);
    }

    public static boolean isAutoCreateShareImage() {
        return getConfigBoolean(LITEMALL_WX_SHARE);
    }

    public static BigDecimal getFreight() {
        return getConfigBigDec(LITEMALL_EXPRESS_FREIGHT_VALUE);
    }

    public static BigDecimal getFreightLimit() {
        return getConfigBigDec(LITEMALL_EXPRESS_FREIGHT_MIN);
    }

    public static Integer getOrderUnpaid() {
        return getConfigInt(LITEMALL_ORDER_UNPAID);
    }

    public static Integer getOrderUnconfirm() {
        return getConfigInt(LITEMALL_ORDER_UNCONFIRM);
    }

    public static Integer getOrderComment() {
        return getConfigInt(LITEMALL_ORDER_COMMENT);
    }

    public static void setConfigs(Map<String, String> configs) {
        SYSTEM_CONFIGS = configs;
    }

    public static void updateConfigs(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            SYSTEM_CONFIGS.put(entry.getKey(), entry.getValue());
        }
    }
}