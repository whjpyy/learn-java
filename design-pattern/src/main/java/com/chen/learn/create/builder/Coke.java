package com.chen.learn.create.builder;

/**
 * 可口可乐
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.9f;
    }
}
