package com.chen.learn.create.abstractfactory;

/**
 * 形状工厂
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class ShapeFactory extends AbstractFactory{

    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    /**
     * 根据传入的类型，获取不同的图形对象
     * @param shape 类型
     * @return 图形对象
     */
    @Override
    public Shape getShape(String shape){
        if(CIRCLE.equalsIgnoreCase(shape)){
            return new Circle();
        }else if(SQUARE.equalsIgnoreCase(shape)){
            return new Square();
        }else if(RECTANGLE.equalsIgnoreCase(shape)){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
