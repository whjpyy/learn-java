package com.chen.learn.create.factory;

/**
 * 工厂模式示例
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();

        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();

        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();
    }
}
