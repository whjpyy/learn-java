package com.chen.learn.create.prototype;

/**
 * 正方形
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Square extends Shape {

    public Square(){
        type = ShapeCache.SQUARE;
    }

    @Override
    void draw() {
        System.out.println("Inside Square: draw() method.");
    }
}
