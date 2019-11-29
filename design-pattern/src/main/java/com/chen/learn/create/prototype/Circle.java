package com.chen.learn.create.prototype;

/**
 * 圆形
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Circle extends Shape {

    public Circle(){
        type = ShapeCache.CIRCLE;
    }

    @Override
    void draw() {
        System.out.println("Inside Circle: draw() method.");
    }
}
