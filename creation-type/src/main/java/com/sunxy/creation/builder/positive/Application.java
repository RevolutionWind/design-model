package com.sunxy.creation.builder.positive;

/**
 * 方法调用
 *
 * @author sunxy
 */
public class Application {
    public void run() {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer intel = computerBuilder.setCpu("intel").setHasCamera(true).build();
        ComputerManualBuilder computerManualBuilder = new ComputerManualBuilder();
        ComputerManual intelManual = computerManualBuilder.setCpu("intel manual").setHasCamera(true).build();
    }
}
