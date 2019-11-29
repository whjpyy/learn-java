package com.chen.learn.create.abstractfactory;

/**
 * 工厂生产者
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class FactoryProducer {

    public static final String SHAPE = "shape";
    public static final String COLOR = "color";

    /**
     * 获取工厂
     * @param choice 选择
     * @return 工厂对象
     */
    public static AbstractFactory getFactory(String choice){
        if(SHAPE.equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if(COLOR.equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
