package com.chen.learn.create.prototype;

/**
 * 长方形
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = ShapeCache.RECTANGLE;
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle: draw() method.");
    }
}
