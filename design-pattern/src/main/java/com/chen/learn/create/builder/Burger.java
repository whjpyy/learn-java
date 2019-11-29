package com.chen.learn.create.builder;

/**
 * 汉堡
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
