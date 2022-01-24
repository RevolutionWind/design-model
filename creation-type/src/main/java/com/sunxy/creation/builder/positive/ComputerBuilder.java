package com.sunxy.creation.builder.positive;

/**
 * 电脑builder
 *
 * @author sunxy
 */
public class ComputerBuilder implements Builder {

    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder setMotherboard(String motherboard) {
        computer.setMotherboard(motherboard);
        return this;
    }

    @Override
    public ComputerBuilder setHasCamera(Boolean hasCamera) {
        computer.setHasCamera(hasCamera);
        return this;
    }

    @Override
    public ComputerBuilder setHasTouchId(Boolean hasTouchId) {
        computer.setHasTouchId(hasTouchId);
        return this;
    }

    @Override
    public ComputerBuilder reset() {
        this.computer = new Computer();
        return this;
    }

    public Computer build() {
        Computer result = this.computer;
        reset();
        return result;
    }
}
