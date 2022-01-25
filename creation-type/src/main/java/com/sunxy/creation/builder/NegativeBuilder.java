package com.sunxy.creation.builder;

import lombok.Getter;

/**
 * 建造者模式
 * 反例
 *
 * @author sunxy
 */
public class NegativeBuilder {

    @Getter
    static class Computer {
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

        public Computer(String cpu,
                        String memory,
                        String motherboard,
                        Boolean hasCamera,
                        Boolean hasTouchId) {
            this.cpu = cpu;
            this.memory = memory;
            this.motherboard = motherboard;
            this.hasCamera = hasCamera;
            this.hasTouchId = hasTouchId;
        }
    }

    /**
     * 创建的对象有很多种属性。想要在创建的时候初始化，要在构造方法中传入所有的属性
     * 这使得对于构造函数的调用十分不简洁。
     *
     * @param args args
     */
    public static void main(String[] args) {
        Computer computer1 = new Computer("intel", "gforce", "board1", null, null);
        Computer computer2 = new Computer("amd", "amd", "board2", false, true);
        Computer computer3 = new Computer("intel", "amd", "board3", true, null);
    }


}
