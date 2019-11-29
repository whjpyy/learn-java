package com.chen.learn.create.builder;

/**
 * 百事可乐
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 4.1f;
    }
}
