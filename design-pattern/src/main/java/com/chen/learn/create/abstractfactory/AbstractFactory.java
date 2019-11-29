package com.chen.learn.create.abstractfactory;

/**
 * 抽象工厂，用于生产形状或者画笔
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public abstract class AbstractFactory {

    /**
     * 获取形状
     * @param shape 类型
     * @return 形状对象
     */
    public abstract Shape getShape(String shape);

    /**
     * 获取画笔
     * @param color 颜色
     * @return 颜色对象
     */
    public abstract Color getColor(String color);
}
