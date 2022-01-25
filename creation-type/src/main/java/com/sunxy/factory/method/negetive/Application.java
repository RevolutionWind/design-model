package com.sunxy.factory.method.negetive;

/**
 * @author sunxy
 */
public class Application {

    public void run() {

//        if (是卡车) {
             new Truck().truckDelivery("");
//        } else if (是船) {
             new Ship().shipDelivery("");
//        }

    }

}
