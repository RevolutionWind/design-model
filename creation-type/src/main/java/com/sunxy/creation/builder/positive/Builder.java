package com.sunxy.creation.builder.positive;

/**
 * 电脑建造者接口
 *
 * @author sunxy
 */
public interface Builder {
    Builder setCpu(String cpu);

    Builder setMemory(String memory);

    Builder setMotherboard(String motherboard);

    Builder setHasCamera(Boolean hasCamera);

    Builder setHasTouchId(Boolean hasTouchId);

    Builder reset();

}
