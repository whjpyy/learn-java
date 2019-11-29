package com.chen.learn.create.builder;

/**
 * 素食汉堡
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
