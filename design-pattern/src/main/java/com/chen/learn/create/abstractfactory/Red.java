package com.chen.learn.create.abstractfactory;

/**
 * 红色
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red.");
    }
}
