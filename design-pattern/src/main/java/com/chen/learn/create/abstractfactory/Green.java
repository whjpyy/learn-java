package com.chen.learn.create.abstractfactory;

/**
 * 绿色
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("fill green.");
    }
}
