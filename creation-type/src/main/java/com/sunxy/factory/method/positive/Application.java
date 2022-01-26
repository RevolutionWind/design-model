package com.sunxy.factory.method.positive;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂
 *
 * 根据条件 选择具体工厂
 * 统一执行工厂方法
 *
 * @author sunxy
 */
public class Application {

    private final Map<String, DeliveryWay> factoryMap = new HashMap<>() {
        {
            put("ship", new Ship());
            put("truck", new Truck());
        }
    };

    public void run() {
        DeliveryWay deliveryWay = factoryMap.get("");
        deliveryWay.shipDelivery("");
    }
}
