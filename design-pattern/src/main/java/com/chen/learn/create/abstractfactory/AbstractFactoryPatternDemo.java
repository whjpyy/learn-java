package com.chen.learn.create.abstractfactory;

/**
 * 抽象工厂示例
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.COLOR);
        Color red = colorFactory.getColor(ColorFactory.RED);
        red.fill();
        Color green = colorFactory.getColor(ColorFactory.GREEN);
        green.fill();
        Color blue = colorFactory.getColor(ColorFactory.BLUE);
        blue.fill();
    }
}
