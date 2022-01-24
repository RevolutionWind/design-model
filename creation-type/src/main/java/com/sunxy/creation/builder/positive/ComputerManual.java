package com.sunxy.creation.builder.positive;

import lombok.Data;

/**
 * 电脑说明书
 *
 * @author sunxy
 */
@Data
public class ComputerManual {
    /**
     * CPU型号
     */
    private String cpu;
    /**
     * 内存信息
     */
    private String memory;
    /**
     * 主板信息
     */
    private String motherboard;
    /**
     * 是否有摄像头
     */
    private Boolean hasCamera;
    /**
     * 是否有touchId
     */
    private Boolean hasTouchId;

}
