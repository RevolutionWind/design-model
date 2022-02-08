package com.sunxy.abstractFactory.positive;

import com.sunxy.abstractFactory.positive.factory.BusinessStyle;
import com.sunxy.abstractFactory.positive.factory.HiphopStyle;
import com.sunxy.abstractFactory.positive.factory.LeisureStyle;
import com.sunxy.abstractFactory.positive.top.Style;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunxy
 */
public class Application {

    private static final Map<String, Style> styleMap = new HashMap<String, Style>() {
        {
            put("business", new BusinessStyle());
            put("hiphop", new HiphopStyle());
            put("leisure", new LeisureStyle());
        }
    };

    /**
     * 根据穿衣风格选择衣服
     *
     * @param styleCommand 风格
     */
    public void getCloseByStyle(String styleCommand) {
        Style style = styleMap.get(styleCommand);
        style.getPants();
        style.getShirt();
        style.getShoes();
    }

}
