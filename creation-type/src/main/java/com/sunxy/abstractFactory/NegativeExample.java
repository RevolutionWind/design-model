package com.sunxy.abstractFactory;

/**
 * 抽象工厂反例
 * <p>
 * 假设有一个服装店可以买各种各样的衣服
 * 但是每个顾客穿着风格都不同。商务、休闲、嘻哈
 * 三种风格的顾客都要来买上衣，裤子，鞋子。但是他们的要求风格不同
 *
 * @author sunxy
 */
public class NegativeExample {


    public void run() {
        // TODO 根据顾客不同风格给顾客挑选衣服class
    }

    // 商务风格的
    class BusinessShirt {

    }

    class BusinessPants {

    }

    class BusinessShoes {

    }

    // 休闲风格的
    class LeisureShirt {

    }

    class LeisurePants {

    }

    class LeisureShoes {

    }

    // 嘻哈风格
    class HiphopShirt {

    }

    class HiphopPants {

    }

    class HiphopShoes {

    }


}
