package com.sunxy.creation.builder.positive;

/**
 * @author sunxy
 */
public class ComputerManualBuilder implements Builder{

    private ComputerManual manual;

    public ComputerManualBuilder() {
        this.manual = new ComputerManual();
    }

    @Override
    public ComputerManualBuilder setCpu(String cpu) {
        manual.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerManualBuilder setMemory(String memory) {
        manual.setMemory(memory);
        return this;
    }

    @Override
    public ComputerManualBuilder setMotherboard(String motherboard) {
        manual.setMotherboard(motherboard);
        return this;
    }

    @Override
    public ComputerManualBuilder setHasCamera(Boolean hasCamera) {
        manual.setHasCamera(hasCamera);
        return this;
    }

    @Override
    public ComputerManualBuilder setHasTouchId(Boolean hasTouchId) {
        manual.setHasTouchId(hasTouchId);
        return this;
    }

    @Override
    public ComputerManualBuilder reset() {
        this.manual = new ComputerManual();
        return this;
    }

    public ComputerManual build() {
        ComputerManual manual = new ComputerManual();
        reset();
        return manual;
    }

}
