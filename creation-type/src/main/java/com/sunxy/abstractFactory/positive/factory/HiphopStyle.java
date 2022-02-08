package com.sunxy.abstractFactory.positive.factory;

import com.sunxy.abstractFactory.positive.impl.hiphop.HiphopPants;
import com.sunxy.abstractFactory.positive.impl.hiphop.HiphopShirt;
import com.sunxy.abstractFactory.positive.impl.hiphop.HiphopShoes;
import com.sunxy.abstractFactory.positive.top.Style;

/**
 * 嘻哈风格
 *
 * @author sunxy
 */
public class HiphopStyle implements Style {

    @Override
    public HiphopShirt getShirt() {
        return null;
    }

    @Override
    public HiphopPants getPants() {
        return null;
    }

    @Override
    public HiphopShoes getShoes() {
        return null;
    }
}
