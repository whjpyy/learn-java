package com.chen.learn.create.prototype;

import java.util.Hashtable;

/**
 * 形状缓存
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    /**
     * 获取形状
     * @param shapeId 形状id
     * @return 形状
     */
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     */
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("circle");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("square");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
