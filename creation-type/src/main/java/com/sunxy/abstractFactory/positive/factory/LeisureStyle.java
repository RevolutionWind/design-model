package com.sunxy.abstractFactory.positive.factory;

import com.sunxy.abstractFactory.positive.impl.leisure.LeisurePants;
import com.sunxy.abstractFactory.positive.impl.leisure.LeisureShirt;
import com.sunxy.abstractFactory.positive.impl.leisure.LeisureShoes;
import com.sunxy.abstractFactory.positive.top.Style;

/**
 * 休闲风格
 *
 * @author sunxy
 */
public class LeisureStyle implements Style {
    @Override
    public LeisureShirt getShirt() {
        return null;
    }

    @Override
    public LeisurePants getPants() {
        return null;
    }

    @Override
    public LeisureShoes getShoes() {
        return null;
    }
}
