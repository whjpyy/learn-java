package com.chen.learn.create.abstractfactory;

/**
 * 颜色工厂
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class ColorFactory extends AbstractFactory {

    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(RED.equalsIgnoreCase(color)){
            return new Red();
        }else if(GREEN.equalsIgnoreCase(color)){
            return new Green();
        }else if(BLUE.equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}
