package com.chen.learn.create.builder;

/**
 * 冷饮
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
