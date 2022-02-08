package com.sunxy.abstractFactory.positive.factory;

import com.sunxy.abstractFactory.positive.impl.business.BusinessPants;
import com.sunxy.abstractFactory.positive.impl.business.BusinessShirt;
import com.sunxy.abstractFactory.positive.impl.business.BusinessShoes;
import com.sunxy.abstractFactory.positive.top.Style;

/**
 * 商务风格
 *
 * @author sunxy
 */
public class BusinessStyle implements Style {

    @Override
    public BusinessShirt getShirt() {
        return null;
    }

    @Override
    public BusinessPants getPants() {
        return null;
    }

    @Override
    public BusinessShoes getShoes() {
        return null;
    }
}
