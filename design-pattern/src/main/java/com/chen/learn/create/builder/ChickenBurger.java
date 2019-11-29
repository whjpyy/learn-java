package com.chen.learn.create.builder;

/**
 * 鸡肉汉堡
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
