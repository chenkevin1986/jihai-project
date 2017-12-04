package com.jihai.mengmian.enums;

import com.jihai.mengmian.utils.common.LOG;

/**
 * 智能用电模式
 * @Author: laiqiuhua.
 * @Date: 2017/9/20 9:33.
 */
public enum  SmartModeEnum {
    SPEED_MODE(5, "极速模式"), BALANCE_MODE(1, "均衡模式"), STANDARD_MODE(3, "标准模式");

    SmartModeEnum(int scale, String desc) {
        this.scale = scale;
        this.desc = desc;
    }

    private int scale;
    private String desc;

    public int getScale() {
        return scale;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 获取智能用电放大倍数
     * @param mode
     * @return
     */
    public static int getSmartElectricityScale(int  mode) {
        SmartModeEnum smartModeEnum = valueOf(mode);
        // 返回-1 表示不支持此模式
        if(null == smartModeEnum) {
            LOG.info(SmartModeEnum.class, "不支持的智能用电模式");
            return -1;
        }
        int scale = 1;
        switch (smartModeEnum) {
            case SPEED_MODE:
                scale = SPEED_MODE.scale;
                LOG.info(SmartModeEnum.class, SPEED_MODE.toString());
                break;
            case BALANCE_MODE:
                scale = BALANCE_MODE.scale;
                LOG.info(SmartModeEnum.class, BALANCE_MODE.toString());
                break;
            case STANDARD_MODE:
                scale = STANDARD_MODE.scale;
                LOG.info(SmartModeEnum.class, STANDARD_MODE.toString());
                break;
            default:
                LOG.info(SmartModeEnum.class, "不支持的智能用电模式");
                break;
        }
        return scale;
    }

    public static SmartModeEnum valueOf(int mode) {
        for(SmartModeEnum smartModeEnum: SmartModeEnum.values()) {
            if (smartModeEnum.ordinal() == mode) {
                return smartModeEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("智能用电模式---[");
        sb.append("放大倍数为").append(scale).append("倍");
        sb.append(", 执行模式为").append(desc).append("]");
        return sb.toString();
    }

}
